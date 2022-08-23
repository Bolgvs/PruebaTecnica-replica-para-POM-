package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Usuario;

public interface UsuarioDAO extends JpaRepository <Usuario, Long> {
	
	public List<Usuario> findByName(String name);
	
}