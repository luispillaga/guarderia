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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
@Table(name = "GUARDERIA")
public class Guarderia implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "IDGUARDERIA")
	private Integer idguarderia;

	@Size(max=20)
	@Column(name="NOMBRE")
	@NotEmpty
	private String nombre;

	@Size(max=15)
	@Column(name="TELEFONO")
	@NotEmpty
	private String telefono;

	@Size(max=35)
	@Column(name="EMAIL")
	@NotEmpty
	@Email
	private String email;
	
	@JoinColumn(name="IDDIRECCION", referencedColumnName="IDDIRECCION")
	@ManyToOne
	private Direccion direccion;

	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Nivel> niveles;

	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Servicio> servicios;

	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Actividad> actividades;

	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Horario> horarios;

	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Galeria> galerias;

	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Reserva> reservas;
	
	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Social> sociales;
	
	@OneToMany(mappedBy="guarderia", fetch=FetchType.LAZY)
	private List<Resena> resenas;
	
}