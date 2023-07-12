package com.Tienda.Service;

import com.Tienda.domain.Categoria;
import com.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    //metodo para ocnsultar las productos
    public List<Producto>getProductos(boolean activos);
    //se obtione una producto por su id
    public Producto getProducto(Producto producto);
    //se inserta cuando el idCatgeoria esta vacio (valor 0/ null)
    // modificar: se modifica cuando el idProducto no esta vacio
    public void save (Producto producto);
    
    //se elimina un registro por su ID
    public void delete(Producto producto);
    
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
}
