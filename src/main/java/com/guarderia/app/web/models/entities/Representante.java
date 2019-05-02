package com.guarderia.app.web.models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "REPRESENTANTE")
public class Representante extends Persona implements Serializable {
    private static final long serialVersionUID = 1L;

    @Size(max=15)
    @Column(name="ESTADOCIVIL")
    @NotEmpty
    private String estadoCivil;

    @OneToMany(mappedBy="representante", fetch= FetchType.LAZY)
    private List<Child> childs;

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<Child> getChilds() {
        return childs;
    }

    public void setChilds(List<Child> childs) {
        this.childs = childs;
    }
}
