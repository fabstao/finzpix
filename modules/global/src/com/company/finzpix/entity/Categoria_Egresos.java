package com.company.finzpix.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|categoria")
@Table(name = "FINZPIX_CATEGORIA_EGRESOS", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FINZPIX_CATEGORIA__EGRESOS_UNQ", columnNames = {"ID"})
})
@Entity(name = "finzpix_Categoria_Egresos")
public class Categoria_Egresos extends StandardEntity {
    private static final long serialVersionUID = -4746559927473530057L;

    @NotNull
    @Column(name = "CATEGORIA", nullable = false, unique = true, length = 100)
    protected String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}