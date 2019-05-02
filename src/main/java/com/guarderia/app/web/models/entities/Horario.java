package com.guarderia.app.web.models.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;
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
	@Temporal(TemporalType.TIME)
	private Date horaapertura;
	
	@Column(name = "HORACIERRE")
	@Temporal(TemporalType.TIME)
	private Date horacierre;
	
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

	public Date getHoraapertura() {
		return horaapertura;
	}

	public void setHoraapertura(Date horaapertura) {
		this.horaapertura = horaapertura;
	}

	public Date getHoracierre() {
		return horacierre;
	}

	public void setHoracierre(Date horacierre) {
		this.horacierre = horacierre;
	}

	public Guarderia getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(Guarderia guarderia) {
		this.guarderia = guarderia;
	}
}
