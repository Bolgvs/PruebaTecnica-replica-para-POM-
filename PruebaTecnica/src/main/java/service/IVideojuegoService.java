package service;

import java.util.List;

import dto.Videojuego;

public interface IVideojuegoService {
	
	public List<Videojuego> listVideojuegos();
	
	public List<Videojuego> VideojuegosByName(String name);
	
	public Videojuego createVideojuego(Videojuego videojuego);
	
	public Videojuego VideojuegosById(Long id);
	
	public void deleteVideojuego(Long id);
	
	public Videojuego updateVideojuego(Videojuego videojuego);
}
