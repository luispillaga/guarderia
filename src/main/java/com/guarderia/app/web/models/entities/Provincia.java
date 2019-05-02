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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name="PROVINCIA")
public class Provincia implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPROVINCIA")
	@Basic(optional = false)
	private Integer idprovincia;
	
	@Size(max=255)
	@Column(name = "NOMBRE")
	private String nombre;
	
	@OneToMany(mappedBy="provincia", fetch= FetchType.LAZY)
	private List<Ciudad> provincias;
	
	
	public Provincia() {
		
	}
	
	public Provincia(Integer id) {
		this.idprovincia = id;
	}

	public Integer getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(Integer idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ciudad> getCiudades() {
		return provincias;
	}

	public void setCiudades(List<Ciudad> ciudades) {
		this.provincias = ciudades;
	}
	
	
}
