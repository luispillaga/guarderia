package com.guarderia.app.web.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Calendar;

@MappedSuperclass
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPERSONA")
    private Integer idPersona;

    @Size(max = 35)
    @Column(name = "NOMBRE")
    @NotEmpty
    private String nombre;

    @Size(max = 35)
    @Column(name = "APELLIDO")
    @NotEmpty
    private String apellido;

    @Size(max = 15)
    @Column(name = "CEDULA")
    @NotEmpty
    private String cedula;

    @Size(max = 15)
    @Column(name = "TELEFONO")
    @NotEmpty
    private String telefono;

    @Size(max = 35)
    @Column(name = "EMAIL")
    @NotEmpty
    @Email
    private String email;

    @Column(name = "FECHANACIMIENTO")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotEmpty
    private Calendar fechaNacimiento;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
