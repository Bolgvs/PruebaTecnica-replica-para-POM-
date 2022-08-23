package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Sala;

public interface SalaDAO extends JpaRepository <Sala, Long> {
	
	public List<Sala> findByName(String name);
	
}