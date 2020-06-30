package com.company.finzpix.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "FINZPIX_INGRESOS", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FINZPIX_INGRESOS_UNQ", columnNames = {"ID"})
})
@Entity(name = "finzpix_Ingresos")
public class Ingresos extends StandardEntity {
    private static final long serialVersionUID = -2618496648980372994L;

    @Column(name = "TIPO", length = 150)
    protected String tipo;

    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USUARIO_ID")
    protected Usuarios usuario;

    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    protected Double cantidad;

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}