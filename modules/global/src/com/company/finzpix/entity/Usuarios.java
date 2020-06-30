package com.company.finzpix.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|nombre")
@Table(name = "FINZPIX_USUARIOS", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FINZPIX_USUARIOS_UNQ", columnNames = {"ID"})
})
@Entity(name = "finzpix_Usuarios")
public class Usuarios extends StandardEntity {
    private static final long serialVersionUID = 3345821356578998947L;

    @NotNull
    @Column(name = "NOMBRE", nullable = false, unique = true)
    protected String nombre;

    @Email
    @Column(name = "EMAIL")
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}