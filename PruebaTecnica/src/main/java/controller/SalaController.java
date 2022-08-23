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

import dto.Sala;
import service.SalaServiceImpl;


@RestController
@RequestMapping("/api")
public class SalaController {
	@Autowired
	SalaServiceImpl SalaServiceImpl;
			
	@GetMapping("/salas")
	public List<Sala> listSalas(){
		return SalaServiceImpl.listSalas();
	}
			
	@GetMapping("/salas/name/{name}")
	public List<Sala> SalasByName(@PathVariable(name="name") String name) {
		return SalaServiceImpl.SalasByName(name);
	}
			
	@PostMapping("/salas")
	public Sala createSala(@RequestBody Sala sala) {
		return SalaServiceImpl.createSala(sala);
	}
		
	@GetMapping("/salas/{id}")
	public Sala SalaById(@PathVariable(name="id") Long id) {
		Sala SalasById = new Sala();
		SalasById = SalaServiceImpl.SalasById(id);
				
		return SalasById;
	}		
	@PutMapping("/salas/{id}")
	public Sala updateSala(@PathVariable(name="id") Long id, @RequestBody Sala sala) {
		Sala selectedSala = new Sala();
		Sala updateSala = new Sala();
				
		selectedSala = SalaServiceImpl.SalasById(id);
				
		selectedSala.setName(sala.getName());
		selectedSala.setPersonasMaximas(sala.getPersonasMaximas());
				
		updateSala = SalaServiceImpl.updateSala(selectedSala);
				
		return updateSala;
	}
			
	@DeleteMapping("/salas/{id}")
	public void deleteSala(@PathVariable(name="id") Long id) {
		SalaServiceImpl.deleteSala(id);
	}
}
