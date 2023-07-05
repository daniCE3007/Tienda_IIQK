package com.Tienda.controller;

import com.Tienda.Service.CategoriaService;
import com.Tienda.Service.Impl.FirebaseStorageServiceImpl;
import com.Tienda.domain.Producto;
import com.Tienda.Service.ProductoService;
import com.Tienda.domain.Categoria;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/producto")
@Slf4j
public class ProductoController {
    
    @Autowired
    ProductoService productoService;
    
    @Autowired
    CategoriaService  categoriaService;   
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
//        false es para traer todos los productos (activos e inactivos) y true solo los activos
        List<Producto> productos = productoService.getProductos(false);
        List<Categoria> categorias = categoriaService.getCategorias(true);
        model.addAttribute("productos", productos);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }
    
    
    
    
}
