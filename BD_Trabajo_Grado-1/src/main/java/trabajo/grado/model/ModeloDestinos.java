package trabajo.grado.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_Destinos")

public class ModeloDestinos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="destino_id")
	private Long destino_id;
	
	@Column(name="lista_destinos")
	private String lista_destinos;

	public Long getDestino_id() {
		return destino_id;
	}

	public void setDestino_id(Long destino_id) {
		this.destino_id = destino_id;
	}

	public String getLista_destinos() {
		return lista_destinos;
	}

	public void setLista_destinos(String lista_destinos) {
		this.lista_destinos = lista_destinos;
	}
	
	
	

}
