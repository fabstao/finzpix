package com.company.finzpix.entity;

import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Table(name = "FINZPIX_EGRESO", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_FINZPIX_EGRESO_UNQ", columnNames = {"ID"})
})
@Entity(name = "finzpix_Egreso")
public class Egreso extends StandardEntity {
    private static final long serialVersionUID = 5336477643673934466L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TIPO_ID")
    protected Tipo_Egresos tipo;

    @NotNull
    @OnDeleteInverse(DeletePolicy.UNLINK)
    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USUARIO_ID")
    protected Usuarios usuario;

    @NotNull
    @Column(name = "DESCRIPCION", nullable = false)
    protected String descripcion;

    @NumberFormat(pattern = "###,###,###.00", decimalSeparator = ".", groupingSeparator = ",")
    @NotNull
    @Column(name = "CANTIDAD", nullable = false)
    protected Double cantidad;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "FECHA", nullable = false)
    protected Date fecha;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public void setTipo(Tipo_Egresos tipo) {
        this.tipo = tipo;
    }

    public Tipo_Egresos getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

}