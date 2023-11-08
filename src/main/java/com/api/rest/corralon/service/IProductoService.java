package com.api.rest.corralon.service;

import java.util.List;

import com.api.rest.corralon.entity.Producto;

public interface IProductoService {

	public List<Producto> obtenerTodos();

	public Producto obtenerxId(Integer id);

	public Producto crear(Producto prod);

	public Producto actualizar(Producto prodModificado);

	public void borrar(Integer id);
}
