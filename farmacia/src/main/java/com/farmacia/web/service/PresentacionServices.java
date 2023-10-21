package com.farmacia.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmacia.web.dao.PresentacionRepository;
import com.farmacia.web.entity.Presentacion;

@Service
public class PresentacionServices {
	@Autowired private PresentacionRepository repopresent;
	
	public List<Presentacion> listarTodos(){
		return repopresent.findAll();
	}
}
