package com.example.demo1servicioproducto.service;

import com.example.demo1servicioproducto.entity.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> findAll();
    public Producto findbyId(Long id);
}
