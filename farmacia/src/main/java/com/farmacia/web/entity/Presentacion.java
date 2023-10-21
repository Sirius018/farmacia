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
@Table(name="presentacion")
public class Presentacion {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "idPresentacion")
	    private int idPresentacion;

	    @Column(name = "Descripcion")
	    private String descripcion;

	    @OneToMany(mappedBy = "obPresentacion")
	    private List<Producto> listaProducto;

		public int getIdPresentacion() {
			return idPresentacion;
		}

		public void setIdPresentacion(int idPresentacion) {
			this.idPresentacion = idPresentacion;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public List<Producto> getListaProducto() {
			return listaProducto;
		}

		public void setListaProducto(List<Producto> listaProducto) {
			this.listaProducto = listaProducto;
		}

}
