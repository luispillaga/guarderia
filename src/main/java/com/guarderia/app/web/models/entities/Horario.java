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
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "HORARIO")
public class Horario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "IDHORARIO")
	private Integer idhorario;
	
	@Column(name="ABIERTO")
	private Boolean abierto;
	
	@Size(max=10)
	@Column(name="DIA")
	private String dia;
	
	@Column(name = "HORAAPERTURA")
	@Min(value = 1)
	private Integer horaapertura;
	
	@Column(name = "HORACIERRE")
	@Min(value = 1)
	private Integer horacierre;
	
	@JoinColumn(name="IDGUARDERIA", referencedColumnName = "IDGUARDERIA")//claves foraneas
	@ManyToOne
	private Guarderia guarderia;
	
	public Horario() {
	}

	public Horario(Integer idhorario) {
		this.idhorario = idhorario;
	}

	public Integer getIdhorario() {
		return idhorario;
	}

	public void setIdhorario(Integer idhorario) {
		this.idhorario = idhorario;
	}

	public Boolean getAbierto() {
		return abierto;
	}

	public void setAbierto(Boolean abierto) {
		this.abierto = abierto;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Integer getHoraapertura() {
		return horaapertura;
	}

	public void setHoraapertura(Integer horaapertura) {
		this.horaapertura = horaapertura;
	}

	public Integer getHoracierre() {
		return horacierre;
	}

	public void setHoracierre(Integer horacierre) {
		this.horacierre = horacierre;
	}
	


}
