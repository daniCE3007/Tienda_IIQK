package com.Tienda.dao;


import com.Tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

//objeto 1 es la clase y se debe de importar y el objeto 2 el tipo del serialVersiobUID
public interface CategoriaDao extends JpaRepository<Categoria, Long>{
    //Mas adelnate vamos a crea metodos más ampliados
    List<Categoria> findByDescripcion(String descripcion);
}
