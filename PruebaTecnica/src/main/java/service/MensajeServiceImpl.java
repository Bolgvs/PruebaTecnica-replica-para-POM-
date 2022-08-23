package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MensajeDAO;
import dto.Mensaje;

@Service
public class MensajeServiceImpl implements IMensajeService {

	@Autowired
	MensajeDAO MensajeDAO;
	
	@Override
	public List<Mensaje> listMensajes() {
		// TODO Auto-generated method stub
		return MensajeDAO.findAll();
	}

	@Override
	public List<Mensaje> MensajesByName(String name) {
		// TODO Auto-generated method stub
		return MensajeDAO.findByName(name);
	}

	@Override
	public Mensaje createMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return MensajeDAO.save(mensaje);
	}

	@Override
	public Mensaje MensajesById(Long id) {
		// TODO Auto-generated method stub
		return MensajeDAO.findById(id).get();
	}

	@Override
	public void deleteMensaje(Long id) {
		// TODO Auto-generated method stub
		MensajeDAO.deleteById(id);
	}

	@Override
	public Mensaje updateMensaje(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return MensajeDAO.save(mensaje);
	}

}
