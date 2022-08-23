package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDAO;
import dto.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	UsuarioDAO UsuarioDAO;
	
	@Override
	public List<Usuario> listUsuarios() {
		// TODO Auto-generated method stub
		return UsuarioDAO.findAll();
	}

	@Override
	public List<Usuario> UsuariosByName(String name) {
		// TODO Auto-generated method stub
		return UsuarioDAO.findByName(name);
	}

	@Override
	public Usuario createUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioDAO.save(usuario);
	}

	@Override
	public Usuario UsuariosById(Long id) {
		// TODO Auto-generated method stub
		return UsuarioDAO.findById(id).get();
	}

	@Override
	public void deleteUsuario(Long id) {
		// TODO Auto-generated method stub
		UsuarioDAO.deleteById(id);
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return UsuarioDAO.save(usuario);
	}

}
