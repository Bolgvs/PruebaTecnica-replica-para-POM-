package service;

import java.util.List;

import dto.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> listUsuarios();
	
	public List<Usuario> UsuariosByName(String name);
	
	public Usuario createUsuario(Usuario usuario);
	
	public Usuario UsuariosById(Long id);
	
	public void deleteUsuario(Long id);
	
	public Usuario updateUsuario(Usuario usuario);
}