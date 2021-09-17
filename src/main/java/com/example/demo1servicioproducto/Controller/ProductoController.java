package com.example.demo1servicioproducto.Controller;

import com.example.demo1servicioproducto.entity.Producto;
import com.example.demo1servicioproducto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductoController {
    @Autowired
    private Environment env;
    @Autowired
    private IProductoService productoService;
    @GetMapping("/lista")
    public List<Producto> listar(){
        return productoService.findAll().stream().map(producto -> {
            producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
            return producto;
        }).collect(Collectors.toList());

    }
}