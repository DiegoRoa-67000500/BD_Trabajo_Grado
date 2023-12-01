package trabajo.grado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trabajo.grado.model.ModeloContacto;
import trabajo.grado.repository.RepoContacto;

@Service
public class ContactoServicio {
	
	@Autowired
	private RepoContacto eRepository;
	
	public List<ModeloContacto> getContactos(){
		return eRepository.findAll();
	}

	public ModeloContacto guardarContacto(ModeloContacto contacto) {
		return eRepository.save(contacto);
	}
	
	public ModeloContacto getUnicoContacto(Long id) {
		Optional<ModeloContacto> contacto = eRepository.findById(id);
		if(contacto.isPresent()) {
			return contacto.get();
		}
		throw new RuntimeException("Contacto no encontrado por id " + id);
	}
	
	public void borrarContacto(Long id) {
		eRepository.deleteById(id);
	}
	
	public ModeloContacto actualizarContacto(ModeloContacto contacto) {
		return eRepository.save(contacto);
	}

}
