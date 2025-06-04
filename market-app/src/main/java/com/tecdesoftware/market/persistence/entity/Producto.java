package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "productos")
public class Producto {
    @Id
    //Valor unico autoimcrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer IdCategoria;

    @Column(name = "codigo_barras")
    private String CodigoBarras;

    @Column(name = "precio_venta")
    private Integer PrecioVenta;

    @Column(name = "cantidad_stock")
    private Integer CantidadStock;

    @Column(name = "estado")

    private Boolean Estado;

    @ManyToOne
    @JoinColumn(name="id_categoria", insertable = false, updatable = false)
    private Categoria categoria;
    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        IdCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        CodigoBarras = codigoBarras;
    }

    public Integer getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(Integer precioVenta) {
        PrecioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return CantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        CantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
