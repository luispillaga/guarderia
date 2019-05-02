package com.guarderia.app.web.models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "BABYSISTER")
public class BabySister extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @Size(max=255)
    @Column(name="EXPERIENCIA")
    @NotEmpty
    private String experiencia;

    @Column(name = "VERIFICADO")
    private Boolean verificado; // Si fue interrumpido no estaria activo

    @Column(name = "PRECIO")
    @NotEmpty
    private Float precio;

    @Size(max=255)
    @Column(name="DESCRIPCION")
    @NotEmpty
    private String descripcion;

    @OneToMany(mappedBy="babySister", fetch=FetchType.LAZY)
    private List<ResenaBabySister> listaResenas;

    @OneToMany(mappedBy="babySister", fetch=FetchType.LAZY)
    private List<ReservaBabySister> reservas;


    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<ResenaBabySister> getListaResenas() {
        return listaResenas;
    }

    public void setListaResenas(List<ResenaBabySister> listaResenas) {
        this.listaResenas = listaResenas;
    }

    public List<ReservaBabySister> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaBabySister> reservas) {
        this.reservas = reservas;
    }

}
