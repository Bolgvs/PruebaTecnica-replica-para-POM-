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

import dto.Videojuego;
import service.VideojuegoServiceImpl;


@RestController
@RequestMapping("/api")
public class VideojuegoController {
	@Autowired
	VideojuegoServiceImpl videojuegoServiceImpl;
			
	@GetMapping("/videojuego")
	public List<Videojuego> listEmployees(){
		return videojuegoServiceImpl.listVideojuegos();
	}
			
	@GetMapping("/videojuego/name/{name}")
	public List<Videojuego> VideojuegosByName(@PathVariable(name="name") String name) {
		return videojuegoServiceImpl.VideojuegosByName(name);
	}
			
	@PostMapping("/videojuego")
	public Videojuego createVideojuego(@RequestBody Videojuego videojuego) {
		return videojuegoServiceImpl.createVideojuego(videojuego);
	}
		
	@GetMapping("/videojuego/{id}")
	public Videojuego VideojuegosById(@PathVariable(name="id") Long id) {
		Videojuego VideojuegosById = new Videojuego();
		VideojuegosById = videojuegoServiceImpl.VideojuegosById(id);
				
		return VideojuegosById;
	}		
	@PutMapping("/videojuego/{id}")
	public Videojuego updateVideojuego(@PathVariable(name="id") Long id, @RequestBody Videojuego videojuego) {
		Videojuego selectedVideojuego = new Videojuego();
		Videojuego updateVideojuego = new Videojuego();
				
		selectedVideojuego = videojuegoServiceImpl.VideojuegosById(id);
				
		selectedVideojuego.setName(videojuego.getName());
		selectedVideojuego.setImage(videojuego.getImage());
				
		updateVideojuego = videojuegoServiceImpl.updateVideojuego(updateVideojuego);
				
		return updateVideojuego;
	}
			
	@DeleteMapping("/videojuego/{id}")
	public void deleteVideojuego(@PathVariable(name="id") Long id) {
		videojuegoServiceImpl.deleteVideojuego(id);
	}
}
