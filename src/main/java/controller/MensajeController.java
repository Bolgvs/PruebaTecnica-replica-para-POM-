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

import dto.Mensaje;
import service.MensajeServiceImpl;


@RestController
@RequestMapping("/api")
public class MensajeController {
		
	@Autowired
	MensajeServiceImpl mensajeServiceImpl;
			
	@GetMapping("/mensajes")
	public List<Mensaje> listMensaje(){
		return mensajeServiceImpl.listMensajes();
	}
			
	@GetMapping("/mensajes/name/{name}")
	public List<Mensaje> MensajesByName(@PathVariable(name="name") String name) {
		return mensajeServiceImpl.MensajesByName(name);
	}
			
	@PostMapping("/mensajes")
	public Mensaje createMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImpl.createMensaje(mensaje);
	}
		
	@GetMapping("/mensajes/{id}")
	public Mensaje MensajeById(@PathVariable(name="id") Long id) {
		Mensaje MensajeById = new Mensaje();
		MensajeById = mensajeServiceImpl.MensajesById(id);
				
		return MensajeById;
	}		
	@PutMapping("/mensajes/{id}")
	public Mensaje Mensaje(@PathVariable(name="id") Long id, @RequestBody Mensaje mensaje) {
		Mensaje selectedMensaje = new Mensaje();
		Mensaje updateMensaje = new Mensaje();
				
		selectedMensaje = mensajeServiceImpl.MensajesById(id);
				
		selectedMensaje.setSender(mensaje.getSender());
		selectedMensaje.setText(mensaje.getText());
		selectedMensaje.setHour(mensaje.getHour());
				
		updateMensaje = mensajeServiceImpl.updateMensaje(selectedMensaje);
				
		return updateMensaje;
	}
			
	@DeleteMapping("/mensajes/{id}")
	public void deleteMensaje(@PathVariable(name="id") Long id) {
		mensajeServiceImpl.deleteMensaje(id);
	}
}

