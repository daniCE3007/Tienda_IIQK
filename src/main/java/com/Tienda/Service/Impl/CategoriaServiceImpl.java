package com.Tienda.Service.Impl;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.domain.Categoria;
import com.Tienda.Service.CategoriaService;
import java.security.spec.NamedParameterSpec;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> categorias = categoriaDao.findAll();
        
        if (activos){
            categorias.removeIf(x -> !x.isActivo());        
        }
        return categorias;
    
    }
        @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
        //Ejemplo metodo ampliado
    @Override
    public List<Categoria> getPorDescripcion(String descripcion){
        return categoriaDao.findByDescripcion(descripcion);
    }

}


