/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.repository;

import com.hibernateboot.videojuegos.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cas_r
 */
public interface IEmpresaRepository extends JpaRepository<Empresa, Integer>{
    
    
    
}
