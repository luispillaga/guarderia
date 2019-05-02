package com.guarderia.app.web.models.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CHILD")
public class Child extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @JoinColumn(name="IDREPRESENTANTE", referencedColumnName = "IDPERSONA")//claves foraneas
    @ManyToOne
    private Representante representante;

    @OneToMany(mappedBy="child", fetch=FetchType.LAZY)
    private List<Reserva> reservas;

    public Child() {
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

}
