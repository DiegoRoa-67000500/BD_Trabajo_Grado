package trabajo.grado.service;

import java.util.List;

import trabajo.grado.model.ModeloDestinos;

public interface ServicioDestinos {

	List<ModeloDestinos> getDestinos();
	
	ModeloDestinos guardarDestinos(ModeloDestinos destinos);
	
	ModeloDestinos getUnicoDestino(Long id);
	
	void borrarDestino (Long id);
	
	ModeloDestinos actualizarDestino (ModeloDestinos destino);
	
}
