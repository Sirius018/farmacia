package com.farmacia.web.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tipocomprobante")
public class Tipocomprobante {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoComprobante")
    private int idTipoComprobante;

    @Column(name = "Descripcion")
    private String descripcion;

    @OneToMany(mappedBy = "obTipoComprobante")
    private List<Venta> listaVenta;

}
