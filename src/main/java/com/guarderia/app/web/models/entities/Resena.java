package com.guarderia.app.web.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RESENA")
public class Resena implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDRESENA")
	@Basic(optional = false)
	private Integer idresena;
	
	@Size(max=500)
	@Column(name = "CONTENIDO")
	private String contenido;
	
	@Column(name = "FECHA")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Calendar fecha;
	
	@Column(name = "PUNTUACION")
	@Min(value = 1)
	@Max(value = 5)
	private int puntuacion;
	
	
	@JoinColumn(name="IDGUARDERIA", referencedColumnName="IDGUARDERIA")
	@ManyToOne
	private Guarderia guarderia;
	
	
	public Resena() {
		
	}
	
	public Resena(Integer id) {
		this.idresena = id;
	}

	public Integer getIddireccion() {
		return idresena;
	}

	public Integer getIdresena() {
		return idresena;
	}

	public void setIdresena(Integer idresena) {
		this.idresena = idresena;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Guarderia getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(Guarderia guarderia) {
		this.guarderia = guarderia;
	}
	
	
}
