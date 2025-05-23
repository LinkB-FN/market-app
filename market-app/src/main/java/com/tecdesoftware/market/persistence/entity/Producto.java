package com.tecdesoftware.market.persistence.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "productos")
public class Producto {
    @Id
    //Valor unico autoimcrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column (name = "id_categoria")
    private Integer IdCategoria;

    @Column (name = "codigo_barras")
    private String CodigoBarras;

    @Column (name = "precio_venta")
    private Integer PrecioVenta;

    @Column(name = "cantidad_stock")
    private Integer CantidadStock;

    @Column (name = "estado")
    private Boolean Estado;




}
