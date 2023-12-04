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

import trabajo.grado.model.ModeloDestinos;
import trabajo.grado.service.ServicioDestinos;

@RestController
public class ControladorDestinos {
	
	private ServicioDestinos eService;
	
	@GetMapping("/destinos")
	public List<ModeloDestinos> getDestinos(){
		return eService.getDestinos();
	}
	
	@GetMapping("destinos/{id}")
	public ModeloDestinos getUnicoDestino(@PathVariable("id") Long id) {
		return eService.getUnicoDestino(id);
	}
	
	@PostMapping("/destinos")
	public ModeloDestinos guardarDestinos(@RequestBody ModeloDestinos destino) {
		return eService.guardarDestinos(destino);
	}
	
	@PutMapping("/destinos/{id}")
	public ModeloDestinos actualizarDestino(@PathVariable Long id, @RequestBody ModeloDestinos destino)
	{
		destino.setDestino_id(id);
		return eService.guardarDestinos(destino);
	}
	
	@DeleteMapping("/destinos")
	public void borrarDestino(@RequestParam("id") Long id) {
		eService.borrarDestino(id);
	}

}
