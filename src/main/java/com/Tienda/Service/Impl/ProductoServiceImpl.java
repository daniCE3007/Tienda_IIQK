package com.Tienda.Service.Impl;

import com.Tienda.dao.ProductoDao;
import com.Tienda.domain.Producto;
import com.Tienda.Service.ProductoService;
import com.Tienda.domain.Categoria;
import java.security.spec.NamedParameterSpec;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoDao productoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activos) {
        List<Producto> productos = productoDao.findAll();
        
        if (activos){
            productos.removeIf(x -> !x.isActivo());        
        }
        return productos;
    
    }
        @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getId_producto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
    
    //Ejemplo de método utilizando Métodos de Query
 public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup){
     return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
 }

}


