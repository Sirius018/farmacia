package com.farmacia.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.web.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
