package com.guarderia.app.web.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ACTIVIDAD")
public class Actividad implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "IDACTIVIDAD")
	private Integer idactividad;
	
	@Size(max=20)
	@Column(name="NOMBRE")
	@NotEmpty
	private String nombre;
	
	@Size(max=20)
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@Size(max=20)
	@Column(name="ICONO")
	private String icono;
	
	@JoinColumn(name="IDGUARDERIA", referencedColumnName = "IDGUARDERIA")//claves foraneas
	@ManyToOne
	private Guarderia guarderia;
	
	public Actividad() {
	}

	public Actividad(Integer idactividad) {
		this.idactividad = idactividad;
	}

	public Integer getIdactividad() {
		return idactividad;
	}

	public void setIdactividad(Integer idactividad) {
		this.idactividad = idactividad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}


	public Guarderia getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(Guarderia guarderia) {
		this.guarderia = guarderia;
	}
}
