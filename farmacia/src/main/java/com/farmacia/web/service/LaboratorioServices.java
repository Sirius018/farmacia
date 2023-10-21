package com.farmacia.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.web.dao.LaboratorioRepository;
import com.farmacia.web.entity.Laboratorio;

@Service
public class LaboratorioServices {
	@Autowired
	private LaboratorioRepository repoLab;
	
	public List<Laboratorio> listarTodos(){
		return repoLab.findAll();
	}

}
