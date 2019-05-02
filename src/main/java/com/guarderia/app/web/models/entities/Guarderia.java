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

	public Guarderia() {
	}

	public Integer getIdguarderia() {
		return idguarderia;
	}

	public void setIdguarderia(Integer idguarderia) {
		this.idguarderia = idguarderia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Nivel> getNiveles() {
		return niveles;
	}

	public void setNiveles(List<Nivel> niveles) {
		this.niveles = niveles;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<Horario> horarios) {
		this.horarios = horarios;
	}

	public List<Galeria> getGalerias() {
		return galerias;
	}

	public void setGalerias(List<Galeria> galerias) {
		this.galerias = galerias;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Social> getSociales() {
		return sociales;
	}

	public void setSociales(List<Social> sociales) {
		this.sociales = sociales;
	}

	public List<Resena> getResenas() {
		return resenas;
	}

	public void setResenas(List<Resena> resenas) {
		this.resenas = resenas;
	}
}