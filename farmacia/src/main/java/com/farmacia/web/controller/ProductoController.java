package com.farmacia.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.farmacia.web.service.LaboratorioServices;
import com.farmacia.web.service.PresentacionServices;
import com.farmacia.web.service.ProductoServices;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired private ProductoServices servicioProduc;	
	@Autowired private PresentacionServices servicioPresent; 
	@Autowired private LaboratorioServices servicioLab;
	
	
	
	@RequestMapping("/lista")
	public String lista(Model model) {		
		  model.addAttribute("productos", servicioProduc.listarTodos());
		  model.addAttribute("presentaciones", servicioPresent.listarTodos());
		  model.addAttribute("laboratorios", servicioLab.listarTodos());
		
		return "producto";
	}

}
