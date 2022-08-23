package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Mensaje;

public interface MensajeDAO extends JpaRepository <Mensaje, Long> {
	
	public List<Mensaje> findByName(String name);
	
}