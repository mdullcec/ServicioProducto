package com.example.demo1servicioproducto.service;


import com.example.demo1servicioproducto.dao.ProductoDao;
import com.example.demo1servicioproducto.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{
    @Autowired
    private ProductoDao productoDao;
    @Override
    @Transactional
    public List<Producto> findAll(){
        return (List<Producto>)  productoDao.findAll();
    }

    @Override
    public Producto findbyId(Long id) {
        return null;
    }


}
