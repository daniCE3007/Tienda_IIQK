package com.Tienda.dao;


import com.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

//objeto 1 es la clase y se debe de importar y el objeto 2 el tipo del serialVersiobUID
public interface ProductoDao extends JpaRepository<Producto, Long>{
    //Mas adelnate vamos a crea metodos más ampliados
    
}
