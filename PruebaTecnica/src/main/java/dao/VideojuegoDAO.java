package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Videojuego;

public interface VideojuegoDAO extends JpaRepository <Videojuego, Long> {
	
	public List<Videojuego> findByName(String name);
	
}
