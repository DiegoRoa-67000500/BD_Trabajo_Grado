package trabajo.grado.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import trabajo.grado.model.ModeloContacto;
import trabajo.grado.service.ServicioContacto;

@RestController
public class ControladorContacto {

	private ServicioContacto eService;
	
	@GetMapping("/contactos")
	public List<ModeloContacto> getContactos(){
		return eService.getContactos();
	}
	
	@GetMapping("contactos/{id}")
	public ModeloContacto getUnicoContacto(@PathVariable("id")Long id) {
		return eService.getUnicoContacto(id);
	}
	
	@PostMapping("/contactos")
	public ModeloContacto guardarContacto(@RequestBody ModeloContacto contacto) {
		return eService.guardarContacto(contacto);
	}
	
	@PutMapping("/contactos/{id}")
	public ModeloContacto actualizarContacto(@PathVariable Long id, @RequestBody ModeloContacto contacto) {
		contacto.setId_contacto(id);
		return eService.guardarContacto(contacto);
	}
	
	@DeleteMapping("/contactos")
	public void borrarContacto(@RequestParam("id") Long id) {
		eService.borrarContacto(id);
	}
}
