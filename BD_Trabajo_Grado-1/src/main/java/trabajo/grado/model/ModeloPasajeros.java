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
@Table(name="tbl_pasajeros")


public class ModeloPasajeros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pasajero")
	private Long id_pasajero;
	
	@Column(name="nombre_adulto")
	private String nombre_adulto;
	
	@Column(name="nombre_niño")
	private String nombre_niño;

	public Long getId_pasajero() {
		return id_pasajero;
	}

	public void setId_pasajero(Long id_pasajero) {
		this.id_pasajero = id_pasajero;
	}

	public String getNombre_adulto() {
		return nombre_adulto;
	}

	public void setNombre_adulto(String nombre_adulto) {
		this.nombre_adulto = nombre_adulto;
	}

	public String getNombre_niño() {
		return nombre_niño;
	}

	public void setNombre_niño(String nombre_niño) {
		this.nombre_niño = nombre_niño;
	}
	
	

}
