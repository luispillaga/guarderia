package com.guarderia.app.web.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "RESERVA")
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDRESERVA")
    private Integer idReserva;

    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Calendar fecha;

    @Size(max = 255)
    @Column(name = "OBSERVACION")
    private String observacion;

    @Size(max = 20)
    @Column(name = "ESTADO")
    private String estado;

    @JoinColumn(name="IDGUARDERIA", referencedColumnName = "IDGUARDERIA")//claves foraneas
    @ManyToOne
    private Guarderia guarderia;

    @JoinColumn(name="IDPERSONA", referencedColumnName = "IDPERSONA")//claves foraneas
    @ManyToOne
    private Child child;

    public Reserva() {
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Guarderia getGuarderia() {
        return guarderia;
    }

    public void setGuarderia(Guarderia guarderia) {
        this.guarderia = guarderia;
    }
}
