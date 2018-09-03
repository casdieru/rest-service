/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.controller;

import com.hibernateboot.videojuegos.model.Empresa;
import java.util.List;
import com.hibernateboot.videojuegos.model.Videojuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hibernateboot.videojuegos.services.VideojuegosDao;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rafaelm
 */
@RestController
@RequestMapping("/video/empresa")
public class VideojuegosController {
    @Autowired
    VideojuegosDao videojuegosDao;
    
    @GetMapping("/{id_emp}/juegos")
    public List<Videojuegos> getAllVideo(@PathVariable int id_emp){
        return videojuegosDao.findAll(id_emp);
    }
    
    @PostMapping("/{id_emp}/juegos")  
    public void saveVideo(@RequestBody Videojuegos video, @PathVariable Integer id_emp){
        video.setEmpresa(new Empresa(id_emp, ""));
        videojuegosDao.saveVideo(video);
    }      
    
    @PutMapping("/{id_emp}/juegos")  
    public void updateVideo(@RequestBody Videojuegos video, @PathVariable int id_emp){
        video.setEmpresa(new Empresa(id_emp, ""));
        videojuegosDao.updateVideo(video);
    }
    
   /* @RequestMapping(name = "/video/{id}", method = RequestMethod.DELETE)
    public void deleteVideo(@PathVariable int id){
        videojuegosDao.deleteVideo(id);
    }*/
        
    
    
}
