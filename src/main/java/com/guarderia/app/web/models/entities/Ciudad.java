package com.guarderia.app.web.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="CIUDAD")
public class Ciudad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCIUDAD")
	@Basic(optional = false)
	private Integer idciudad;
	
	@Size(max=255)
	@Column(name = "NOMBRE")
	private String nombre;
	
	
	@JoinColumn(name="IDPROVINCIA", referencedColumnName="IDPROVINCIA")
	@ManyToOne
	private Provincia provincia;
	
	
	@OneToMany(mappedBy="ciudad", fetch= FetchType.LAZY)
	private List<Direccion> direcciones;
	

	public Ciudad() {
		
	}
	
	public Ciudad(Integer id) {
		this.idciudad = id;
	}

	public Integer getIdciudad() {
		return idciudad;
	}

	public void setIdciudad(Integer idciudad) {
		this.idciudad = idciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	
	
}
