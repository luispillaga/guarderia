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
@Table(name="DIRECCION")
public class Direccion implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDIRECCION")
	@Basic(optional = false)
	private Integer iddireccion;
	
	
	@Size(max=255)
	@Column(name = "CALLEPRINCIPAL")
	private String calleprincipal;
	
	
	@Size(max=255)
	@Column(name = "CALLESECUNDARIA")
	private String callesecundaria;
	
	
	@Size(max=25)
	@Column(name = "LATITUD")
	private float latitud;
	
	
	@Size(max=25)
	@Column(name = "LONGITUD")
	private float longitud 	;
	
	
	@Size(max=500)
	@Column(name = "REFERENCIA")
	private String referencia;
	
	
	@JoinColumn(name="IDCIUDAD", referencedColumnName="IDCIUDAD")
	@ManyToOne
	private Ciudad ciudad;
	
	
	@OneToMany(mappedBy="guarderia", fetch= FetchType.LAZY)
	private List<Guarderia> guarderias;
	
	
	public Direccion() {
		
	}
	
	public Direccion(Integer id) {
		this.iddireccion = id;
	}

	public Integer getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getCalleprincipal() {
		return calleprincipal;
	}

	public void setCalleprincipal(String calleprincipal) {
		this.calleprincipal = calleprincipal;
	}

	public String getCallesecundaria() {
		return callesecundaria;
	}

	public void setCallesecundaria(String callesecundaria) {
		this.callesecundaria = callesecundaria;
	}

	public float getLatitud() {
		return latitud;
	}

	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public List<Guarderia> getGuarderias() {
		return guarderias;
	}

	public void setGuarderias(List<Guarderia> guarderias) {
		this.guarderias = guarderias;
	}
	
	
	
}
