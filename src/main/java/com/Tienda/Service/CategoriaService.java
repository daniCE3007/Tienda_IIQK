package com.Tienda.Service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //metodo para ocnsultar las categorias
    public List<Categoria>getCategorias(boolean activos);
            
}
