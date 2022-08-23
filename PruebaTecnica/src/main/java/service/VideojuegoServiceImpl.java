package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.VideojuegoDAO;
import dto.Videojuego;

@Service
public class VideojuegoServiceImpl implements IVideojuegoService {

	@Autowired
	VideojuegoDAO VideojuegoDAO;
	
	@Override
	public List<Videojuego> listVideojuegos() {
		// TODO Auto-generated method stub
		return VideojuegoDAO.findAll();
	}

	@Override
	public List<Videojuego> VideojuegosByName(String name) {
		// TODO Auto-generated method stub
		return VideojuegoDAO.findByName(name);
	}

	@Override
	public Videojuego createVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		return VideojuegoDAO.save(videojuego);
	}

	@Override
	public Videojuego VideojuegosById(Long id) {
		// TODO Auto-generated method stub
		return VideojuegoDAO.findById(id).get();
	}

	@Override
	public void deleteVideojuego(Long id) {
		// TODO Auto-generated method stub
		VideojuegoDAO.deleteById(id);
	}

	@Override
	public Videojuego updateVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		return VideojuegoDAO.save(videojuego);
	}

}