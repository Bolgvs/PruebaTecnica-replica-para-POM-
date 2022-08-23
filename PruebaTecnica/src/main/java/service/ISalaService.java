package service;

import java.util.List;

import dto.Sala;

public interface ISalaService {
	
	public List<Sala> listSalas();
	
	public List<Sala> SalasByName(String name);
	
	public Sala createSala(Sala sala);
	
	public Sala SalasById(Long id);
	
	public void deleteSala(Long id);
	
	public Sala updateSala(Sala sala);
}