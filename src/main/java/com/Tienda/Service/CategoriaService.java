package com.Tienda.Service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //metodo para ocnsultar las categorias
    public List<Categoria>getCategorias(boolean activos);
    //se obtione una categoria por su id
    public Categoria getCategoria(Categoria categoria);
    //se inserta cuando el idCatgeoria esta vacio (valor 0/ null)
    // modificar: se modifica cuando el idCategoria no esta vacio
    public void save (Categoria categoria);
    
    //se elimina un registro por su ID
    public void delete(Categoria categoria);
}
