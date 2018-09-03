/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rafaelm
 */
@Entity
@Table(name="juegos")
public class Videojuegos {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideojuego;
    private String nombre;
    private String plataforma;
    
    @ManyToOne
    private Empresa empresa;
    
    public Videojuegos(){}

    public Videojuegos(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
    }
    
    

    public int getIdVideojuego() {
        return idVideojuego;
    }

    public void setIdVideojuego(int idVideojuego) {
        this.idVideojuego = idVideojuego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
}
