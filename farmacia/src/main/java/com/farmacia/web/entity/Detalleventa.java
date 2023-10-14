package com.farmacia.web.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="detalleventa")
public class Detalleventa {
	@Id
    @ManyToOne
    private Venta venta;

    @Id
    @ManyToOne
    private Producto producto;

    @Column(name = "Cantidad")
    private int cantidad;

    @Column(name = "Precio")
    private double precio;

    @Column(name = "Importe")
    private double importe;


}
