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
import javax.validation.constraints.Size;


@Entity
@Table(name="SOCIAL")
public class Social implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDSOCIAL")
	@Basic(optional = false)
	private Integer idsocial;
	
	@Size(max=50)
	@Column(name = "CLAVE")
	private String clave;
	
	@Size(max=100)
	@Column(name = "NOMBRE")
	private String nombre;
		
	@Size(max=100)
	@Column(name = "LINK")
	private String link;

	@JoinColumn(name="IDGUARDERIA", referencedColumnName="IDGUARDERIA")
	@ManyToOne
	private Guarderia guarderia;
	
	
	public Social() {
		
	}
	
	public Social(Integer id) {
		this.idsocial = id;
	}

	public Integer getIdsocial() {
		return idsocial;
	}

	public void setIdsocial(Integer idsocial) {
		this.idsocial = idsocial;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Guarderia getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(Guarderia guarderia) {
		this.guarderia = guarderia;
	}
	
	
	
}
