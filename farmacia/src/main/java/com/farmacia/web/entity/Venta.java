package com.farmacia.web.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVenta")
    private int idVenta;

    @Column(name = "Serie")
    private String serie;

    @Column(name = "Numero")
    private String numero;

    @Column(name = "Fecha")
    private String fecha;

    @Column(name = "VentaTotal")
    private double ventaTotal;

    @Column(name = "Descuento")
    private double descuento;

    @Column(name = "SubTotal")
    private double subTotal;

    @Column(name = "Igv")
    private double igv;

    @Column(name = "Total")
    private double total;

    @Column(name = "Estado")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idTipoComprobante")
    private Tipocomprobante obTipoComprobante;
}
