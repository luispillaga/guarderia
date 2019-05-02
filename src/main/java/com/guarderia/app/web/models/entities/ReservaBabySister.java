package com.guarderia.app.web.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;

@Entity
@Table(name = "RESERVABABYSISTER")
public class ReservaBabySister implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDRESERVABABYSISTER")
    private Integer idReservaBabySister;

    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Calendar fecha;

    @Column(name = "HORAINICIO")
    @Temporal(TemporalType.TIME)
    @Min(value = 1)
    private Calendar horaInicio;

    @Column(name = "HORAFIN")
    @Temporal(TemporalType.TIME)
    @Min(value = 1)
    private Calendar horaFin;

    @Size(max = 20)
    @Column(name = "ESTADO")
    private String estado;

    @Size(max = 255)
    @Column(name = "OBSERVACION")
    private String observacion;

    @JoinColumn(name="IDBABYSISTER", referencedColumnName = "IDPERSONA")//claves foraneas
    @ManyToOne
    private BabySister babySister;

    public Integer getIdReservaBabySister() {
        return idReservaBabySister;
    }

    public void setIdReservaBabySister(Integer idReservaBabySister) {
        this.idReservaBabySister = idReservaBabySister;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Calendar getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Calendar horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Calendar getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Calendar horaFin) {
        this.horaFin = horaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public BabySister getBabySister() {
        return babySister;
    }

    public void setBabySister(BabySister babySister) {
        this.babySister = babySister;
    }
}
