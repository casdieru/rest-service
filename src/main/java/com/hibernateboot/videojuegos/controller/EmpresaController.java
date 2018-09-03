/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.controller;

import com.hibernateboot.videojuegos.model.Empresa;
import com.hibernateboot.videojuegos.services.EmpresaDao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cas_r
 */

@RestController
@RequestMapping("/video")
public class EmpresaController {
    
    @Autowired
    EmpresaDao empresaDao;
    
    @GetMapping("/empresa")
    public List<Empresa> getAllEmpresa(){
        return empresaDao.findAll();
    }
    
    @PostMapping("/empresa")  
    public void saveEmpresa(@RequestBody Empresa empresa){
        empresaDao.saveEmpresa(empresa);
    }      
    
     @PutMapping("/empresa/{id_emp}")
    public void putEmpresa(@PathVariable Integer id_emp, @RequestBody Empresa empresa){
        empresaDao.putEmpresa(empresa, id_emp);
        }
    
      @DeleteMapping("/empresa/{id_emp}")
    public void deleteEmpresa(@PathVariable Integer id_emp){
        empresaDao.deleteEmpresa(id_emp);
        }
}
