package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name="compras_productos")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPK id;

    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name="id_compra", insertable = false, updatable = false)
    private Compras compras;

    @ManyToOne
    @JoinColumn(name="id_producto", insertable = false, updatable = false)
    private Producto producto;

    public CompraProductoPK getId() {
        return id;
    }

    public void setId(CompraProductoPK id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
