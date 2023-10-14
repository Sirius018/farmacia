package com.farmacia.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "Concentracion")
    private String concentracion;

    @Column(name = "Stock")
    private int stock;

    @Column(name = "Precio_Venta")
    private double precioVenta;

    @Column(name = "FechaVencimiento")
    private String fechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "idPresentacion")
    private Presentacion obPresentacion;

    @ManyToOne
    @JoinColumn(name = "idLaboratorio")
    private Laboratorio obLaboratorio;
    

}
