package com.guarderia.app.web.models.entities;

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
public class Social {
	
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
	
}
