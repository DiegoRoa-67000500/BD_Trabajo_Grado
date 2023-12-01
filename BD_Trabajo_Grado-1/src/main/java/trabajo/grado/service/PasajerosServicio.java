package trabajo.grado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trabajo.grado.model.ModeloPasajeros;
import trabajo.grado.repository.RepoPasajeros;

@Service
public class PasajerosServicio {

	@Autowired
	private RepoPasajeros eRepository;
	
	public List<ModeloPasajeros> getPasajeros(){
		return eRepository.findAll();
	}
	
	public ModeloPasajeros guardarPasajeror(ModeloPasajeros pasajeros) {
		return eRepository.save(pasajeros);
	}
	
	public ModeloPasajeros getUnicoPasajeros(Long id) {
		Optional<ModeloPasajeros> pasajeros = eRepository.findById(id);
		if(pasajeros.isPresent()) {
			return pasajeros.get();		
		}
		throw new RuntimeException("Pasajeros no encontrados con id " +id);
	}
	
	public void borrarPasajeros(Long id) {
		eRepository.deleteById(id);
	}
	
	public ModeloPasajeros actualizarPasajeros(ModeloPasajeros pasajeros) {
		return eRepository.save(pasajeros);
	}
}
