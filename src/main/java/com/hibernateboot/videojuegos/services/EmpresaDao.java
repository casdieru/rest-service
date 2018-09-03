/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.services;

import com.hibernateboot.videojuegos.model.Empresa;
import com.hibernateboot.videojuegos.repository.IEmpresaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cas_r
 */

@Service
public class EmpresaDao {
    
    @Autowired
    IEmpresaRepository iEmpresaRepository;
    
    public List<Empresa> findAll() {
        return iEmpresaRepository.findAll();
    }
    
    public void saveEmpresa(Empresa empresa){
        iEmpresaRepository.save(empresa);
    }
    
    public void putEmpresa(Empresa empresa, int id){
        iEmpresaRepository.save(empresa);
    }
    
    public void deleteEmpresa(Integer id_emp) {
        iEmpresaRepository.deleteById(id_emp);
    }
    
        
}
