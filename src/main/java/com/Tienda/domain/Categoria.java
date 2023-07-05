package com.Tienda.domain;
//se crea un dao y una clase por cada tabla

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

//setea los getter y setter
@Data
//se declara con entidad
@Entity 
//se define la tabla del MySQL
@Table(name ="categoria")
public class Categoria implements Serializable{
    
    private static final long serialVersiobUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")      
    private long idCategoria; // el Serializable lo TRANFORMAR EN id_categoria de la base de datos
    private String description; 
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name = "id_producto")
    private List<Producto> productos; 

    public Categoria() {
    }

    public Categoria(String description, String rutaImagen, boolean activo) {
        //EL id NO SE DEFIEN POR QUE E SAUTOINCREMENTAL EN LA BASE DE DATOS
        this.description = description;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
}
