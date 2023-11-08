package com.api.rest.corralon.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.rest.corralon.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Integer> {
	// crear metodos personalizados

}