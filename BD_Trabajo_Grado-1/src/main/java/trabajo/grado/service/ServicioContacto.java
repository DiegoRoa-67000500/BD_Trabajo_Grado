package trabajo.grado.service;

import java.util.List;

import trabajo.grado.model.ModeloContacto;

public interface ServicioContacto {
	
	List<ModeloContacto> getContactos();
	
	ModeloContacto guardarContacto(ModeloContacto contacto);
	
	ModeloContacto getUnicoContacto(Long id);
	
	void borrarContacto (Long id);
	
	ModeloContacto actualizarContacto(ModeloContacto contacto);
	

}
