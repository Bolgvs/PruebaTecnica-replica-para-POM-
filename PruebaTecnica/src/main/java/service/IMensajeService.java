package service;

import java.util.List;

import dto.Mensaje;

public interface IMensajeService {
	
	public List<Mensaje> listMensajes();
	
	public List<Mensaje> MensajesByName(String name);
	
	public Mensaje createMensaje(Mensaje mensaje);
	
	public Mensaje MensajesById(Long id);
	
	public void deleteMensaje(Long id);
	
	public Mensaje updateMensaje(Mensaje mensaje);
}
