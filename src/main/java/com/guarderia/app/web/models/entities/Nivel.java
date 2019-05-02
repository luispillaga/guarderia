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
@Table(name = "NIVEL")
public class Nivel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "IDNIVEL")
	private Integer idnivel;
	
	@Size(max=20)
	@Column(name="NOMBRE")
	@NotEmpty
	private String nombre;
	
	@Size(max=10)
	@Column(name="RANGOEDADES")
	@NotEmpty
	private String rangoedades;
	
	@Column(name = "PRECIO")
	private float precio;
	
	@JoinColumn(name="IDGUARDERIA", referencedColumnName = "IDGUARDERIA")//claves foraneas
	@ManyToOne
	private Guarderia guarderia;
	
	public Nivel() {
	}

	public Nivel(Integer idnivel) {
		this.idnivel = idnivel;
	}

	public Integer getIdnivel() {
		return idnivel;
	}

	public void setIdnivel(Integer idnivel) {
		this.idnivel = idnivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRangoedades() {
		return rangoedades;
	}

	public void setRangoedades(String rangoedades) {
		this.rangoedades = rangoedades;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Guarderia getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(Guarderia guarderia) {
		this.guarderia = guarderia;
	}
}
