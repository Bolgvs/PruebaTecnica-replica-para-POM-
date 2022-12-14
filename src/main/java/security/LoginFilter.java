package security;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LoginFilter  extends AbstractAuthenticationProcessingFilter {

    public LoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(
            HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException, IOException, ServletException {

    	// get the body of the request that we assume is in JSON format
        InputStream body = req.getInputStream();

        // We assume that the body will have the following JSON {"username":"nico", "password":"remote"}
        // We make a mapping to our User class to have the data there
        User user = new ObjectMapper().readValue(body, User.class);

        // Finally we authenticate
        // Spring will compare the received user/password
        // against the one we defined in the SecurityConfig class
        return getAuthenticationManager().authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getName(),
                        user.getPassword(),
                        Collections.emptyList()
                )
        );
    }

    @Override
    protected void successfulAuthentication(
            HttpServletRequest req,
            HttpServletResponse res, FilterChain chain,
            Authentication auth) throws IOException, ServletException {

    	// If the authentication was successful, we add the token to the response
        JwtUtil.addAuthentication(res, auth.getName());
    }
}