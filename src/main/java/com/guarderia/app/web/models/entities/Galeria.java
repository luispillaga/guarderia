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
@Table(name = "GALERIA")
public class Galeria  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "IDGALERIA")
	private Integer idgaleria;
	
	@Size(max=20)
	@Column(name="IMAGEN")
	private String imagen;
	
	@JoinColumn(name="IDGUARDERIA", referencedColumnName = "IDGUARDERIA")//claves foraneas
	@ManyToOne
	private Guarderia guarderia;
	
	public Galeria() {
	}

	public Galeria(Integer idgaleria) {
		this.idgaleria = idgaleria;
	}

	public Integer getIdgaleria() {
		return idgaleria;
	}

	public void setIdgaleria(Integer idgaleria) {
		this.idgaleria = idgaleria;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Guarderia getGuarderia() {
		return guarderia;
	}

	public void setGuarderia(Guarderia guarderia) {
		this.guarderia = guarderia;
	}
}
