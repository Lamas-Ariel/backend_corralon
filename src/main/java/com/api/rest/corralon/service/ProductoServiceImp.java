package com.api.rest.corralon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.corralon.entity.Producto;
import com.api.rest.corralon.models.dao.IProductoDao;

@Service
public class ProductoServiceImp implements IProductoService {

	@Autowired
	private IProductoDao productoDao;

	@Override
	public List<Producto> obtenerTodos() {
		// TODO Auto-generated method stub
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	public Producto obtenerxId(Integer id) {
		// TODO Auto-generated method stub
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto crear(Producto prod) {
		// TODO Auto-generated method stub
		return productoDao.save(prod);
	}

	@Override
	public Producto actualizar(Producto prodModificado) {
		// TODO Auto-generated method stub
		return productoDao.save(prodModificado);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		productoDao.deleteById(id);
	}

}
