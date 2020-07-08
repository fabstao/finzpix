package com.company.finzpix.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|tipo")
@Table(name = "FINZPIX_TIPO_EGRESOS", indexes = {
        @Index(name = "IDX_FINZPIX_TIPO__EGRESOS", columnList = "CATEGORIA_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FINZPIX_TIPO__EGRESOS_UNQ", columnNames = {"ID"})
})
@Entity(name = "finzpix_Tipo_Egresos")
public class Tipo_Egresos extends StandardEntity {
    private static final long serialVersionUID = -5761447592470752979L;

    @NotNull
    @Column(name = "TIPO", nullable = false, unique = true, length = 150)
    protected String tipo;

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @OnDelete(DeletePolicy.UNLINK)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CATEGORIA_ID")
    protected Categoria_Egresos categoria;

    public Categoria_Egresos getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria_Egresos categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}