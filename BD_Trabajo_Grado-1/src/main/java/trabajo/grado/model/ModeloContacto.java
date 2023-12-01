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
@Table(name= "tbl_Contacto")


public class ModeloContacto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_contacto")
	private Long id_contacto;
	
	@Column(name="nombre_contacto")
	private String nombre_contacto;
	
	@Column(name="contacto_cedula")
	private Long cedula_contacto;
	
	@Column(name="contacto_correo")
	private String correo_contacto;
	
	@Column(name="telefono_contacto")
	private Long telefono_contacto;
	
	@Column(name="direccion_contacto")
	private String direccion_contacto;

	public Long getId_contacto() {
		return id_contacto;
	}

	public void setId_contacto(Long id_contacto) {
		this.id_contacto = id_contacto;
	}

	public String getNombre_contacto() {
		return nombre_contacto;
	}

	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}

	public Long getCedula_contacto() {
		return cedula_contacto;
	}

	public void setCedula_contacto(Long cedula_contacto) {
		this.cedula_contacto = cedula_contacto;
	}

	public String getCorreo_contacto() {
		return correo_contacto;
	}

	public void setCorreo_contacto(String correo_contacto) {
		this.correo_contacto = correo_contacto;
	}

	public Long getTelefono_contacto() {
		return telefono_contacto;
	}

	public void setTelefono_contacto(Long telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}

	public String getDireccion_contacto() {
		return direccion_contacto;
	}

	public void setDireccion_contacto(String direccion_contacto) {
		this.direccion_contacto = direccion_contacto;
	}
	
}
