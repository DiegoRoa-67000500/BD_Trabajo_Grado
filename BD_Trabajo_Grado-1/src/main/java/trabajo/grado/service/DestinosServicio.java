package trabajo.grado.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trabajo.grado.model.ModeloDestinos;
import trabajo.grado.repository.RepoDestinos;

@Service
public class DestinosServicio {

	@Autowired
	private RepoDestinos eRepository;
	
	public List<ModeloDestinos> getDestinos(){
		return eRepository.findAll();
	}

	public ModeloDestinos guardarDestino(ModeloDestinos destino) {
		return eRepository.save(destino);
	}
		
	public ModeloDestinos getUnicoDestino(Long id) {
		Optional<ModeloDestinos> destino = eRepository.findById(id);
		if(destino.isPresent()) {
			return destino.get();
		}
		throw new RuntimeException("Destino no encontrado para ID "+id);
	}
	
	public void borrarDestino(Long id) {
		eRepository.deleteById(id);
	}
	
	public ModeloDestinos actualizarDestino(ModeloDestinos destino) {
		return eRepository.save(destino);
	}
	
	
	
	
}
