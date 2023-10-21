package com.farmacia.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; // Asegúrate de importar la anotación @Service

import com.farmacia.web.dao.ProductoRepository;
import com.farmacia.web.entity.Producto;

@Service // Asegúrate de anotar tu clase como @Service
public class ProductoServices {
	@Autowired	
	private ProductoRepository repoProd;
	
	public void registrar(Producto m) {
		repoProd.save(m);
	}
	
	public void actualizar(Producto m) {
		repoProd.save(m);
	}
	
	public void eliminar(Integer cod) {
		repoProd.deleteById(cod);
	}
	
	public Producto buscarPorID(Integer cod) {
		return repoProd.findById(cod).orElse(null);
	}
	
	public List<Producto> listarTodos(){
		return repoProd.findAll();
	}
}
