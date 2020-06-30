package com.company.finzpix.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Table(name = "FINZPIX_BALANCE", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FINZPIX_BALANCE_UNQ", columnNames = {"ID"})
})
@Entity(name = "finzpix_Balance")
public class Balance extends StandardEntity {
    private static final long serialVersionUID = 3461311756456580500L;

    @NotNull
    @Column(name = "DESCRIPCION", nullable = false)
    protected String descripcion;

    @NotNull
    @Column(name = "BALANCE", nullable = false)
    protected Double balance;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}