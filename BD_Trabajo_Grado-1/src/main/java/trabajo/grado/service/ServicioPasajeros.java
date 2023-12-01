package trabajo.grado.service;

import java.util.List;

import trabajo.grado.model.ModeloPasajeros;

public interface ServicioPasajeros {
	
	List<ModeloPasajeros> getPasajeros();
	
	ModeloPasajeros guardarPasajeros(ModeloPasajeros pasajeros);
	
	ModeloPasajeros getUnicoPasajeros(Long id);
	
	void borrarPasajeros(Long id);
	
	ModeloPasajeros actualizarPasajeros(ModeloPasajeros pasajeros);

}
