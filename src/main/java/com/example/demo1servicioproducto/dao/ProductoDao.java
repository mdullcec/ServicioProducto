package com.example.demo1servicioproducto.dao;

import com.example.demo1servicioproducto.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductoDao extends CrudRepository<Producto,Long> {
    Optional<Object> findAllById(Long id);
}
