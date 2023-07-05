package com.Tienda.controller;

import com.Tienda.domain.Categoria;
import com.Tienda.Service.CategoriaService;
import com.Tienda.Service.Impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria")
@Slf4j
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

    @GetMapping("/listado")
    public String page(Model model) {
        log.info("Consumo del recurso /categoria/listado");
        List<Categoria> categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("Total", categorias.size());
        return "/categoria/listado";
    }

}
