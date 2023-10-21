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

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String concentracion) {
		this.concentracion = concentracion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Presentacion getObPresentacion() {
		return obPresentacion;
	}

	public void setObPresentacion(Presentacion obPresentacion) {
		this.obPresentacion = obPresentacion;
	}

	public Laboratorio getObLaboratorio() {
		return obLaboratorio;
	}

	public void setObLaboratorio(Laboratorio obLaboratorio) {
		this.obLaboratorio = obLaboratorio;
	}
    

}
 