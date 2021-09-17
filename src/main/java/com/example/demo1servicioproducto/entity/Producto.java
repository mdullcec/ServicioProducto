package com.example.demo1servicioproducto.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private Double precio;
@Transient
private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

   /* public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }*/

    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
