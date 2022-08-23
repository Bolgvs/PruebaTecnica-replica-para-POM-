package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.SalaDAO;
import dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService {

	@Autowired
	SalaDAO SalaDAO;
	
	@Override
	public List<Sala> listSalas() {
		// TODO Auto-generated method stub
		return SalaDAO.findAll();
	}

	@Override
	public List<Sala> SalasByName(String name) {
		// TODO Auto-generated method stub
		return SalaDAO.findByName(name);
	}

	@Override
	public Sala createSala(Sala sala) {
		// TODO Auto-generated method stub
		return SalaDAO.save(sala);
	}

	@Override
	public Sala SalasById(Long id) {
		// TODO Auto-generated method stub
		return SalaDAO.findById(id).get();
	}

	@Override
	public void deleteSala(Long id) {
		// TODO Auto-generated method stub
		SalaDAO.deleteById(id);
	}

	@Override
	public Sala updateSala(Sala sala) {
		// TODO Auto-generated method stub
		return SalaDAO.save(sala);
	}

}
