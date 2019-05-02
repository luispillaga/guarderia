package com.guarderia.app.web.models.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RESENABABYSISTER")
public class ResenaBabySister implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDRESENABABYSISTER")
    private Integer idReservaBabySister;

    @JoinColumn(name="IDBABYSISTER", referencedColumnName = "IDPERSONA")//claves foraneas
    @ManyToOne
    private BabySister babySister;

    public Integer getIdReservaBabySister() {
        return idReservaBabySister;
    }

    public void setIdReservaBabySister(Integer idReservaBabySister) {
        this.idReservaBabySister = idReservaBabySister;
    }

    public BabySister getBabySister() {
        return babySister;
    }

    public void setBabySister(BabySister babySister) {
        this.babySister = babySister;
    }
}
