package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Usuario;
import service.UsuarioServiceImpl;


@RestController
@RequestMapping("/api")
public class UsuarioController {
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
			
	@GetMapping("/usuarios")
	public List<Usuario> listUsuarios(){
		return usuarioServiceImpl.listUsuarios();
	}
			
	@GetMapping("/usuarios/name/{name}")
	public List<Usuario> UsuariosByName(@PathVariable(name="name") String name) {
		return usuarioServiceImpl.UsuariosByName(name);
	}
			
	@PostMapping("/usuarios")
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.createUsuario(usuario);
	}
		
	@GetMapping("/usuarios/{id}")
	public Usuario UsuarioById(@PathVariable(name="id") Long id) {
		Usuario EmployeeById = new Usuario();
		EmployeeById = usuarioServiceImpl.UsuariosById(id);
				
		return EmployeeById;
	}		
	@PutMapping("/usuarios/{id}")
	public Usuario updateUsuario(@PathVariable(name="id") Long id, @RequestBody Usuario usuario) {
		Usuario selectedUsuario = new Usuario();
		Usuario updateUsuario = new Usuario();
				
		selectedUsuario = usuarioServiceImpl.UsuariosById(id);
				
		selectedUsuario.setName(usuario.getName());
		selectedUsuario.setUsername(usuario.getUsername());
		selectedUsuario.setSteamProfile(usuario.getSteamProfile());
		selectedUsuario.setEpicgamesProfile(usuario.getEpicgamesProfile());
				
		updateUsuario = usuarioServiceImpl.updateUsuario(selectedUsuario);
				
		return updateUsuario;
	}
			
	@DeleteMapping("/usuarios/{id}")
	public void deleteUsuario(@PathVariable(name="id") Long id) {
		usuarioServiceImpl.deleteUsuario(id);
	}
}
