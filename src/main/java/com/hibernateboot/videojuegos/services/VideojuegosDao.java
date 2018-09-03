/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernateboot.videojuegos.services;

import java.util.List;
import com.hibernateboot.videojuegos.model.Videojuegos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hibernateboot.videojuegos.repository.IVideoRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author rafaelm
 */
@Service
public class VideojuegosDao {
    
    @Autowired
    IVideoRepository iVideoRepository;    

    Session session;
    
    public List<Videojuegos> findAll(Integer id_emp) {
        return iVideoRepository.findByEmpresa_IdEmpresa(id_emp);
    }
    
    public Videojuegos getById(int id){
        return  iVideoRepository.getOne(id);
    }
     
    public Videojuegos saveVideo(Videojuegos video){
        return iVideoRepository.save(video);
    }
    
    public Videojuegos updateVideo(int id, Videojuegos video){ 
        return iVideoRepository.save(video);
    }
    
    public void deleteVideo(int id){
        iVideoRepository.deleteById(id);
    }
    
    /* public void updateVideo(Videojuegos video, int id){
         Videojuegos videoAModificar = getById(id);
         try {
             Transaction transaction  = session.beginTransaction();
             videoAModificar.setNombre(video.getNombre());
             videoAModificar.setNombre(video.getPlataforma());

             session.saveOrUpdate(id);
             transaction.commit();
             session.close();
         } catch (HibernateException he){
            he.printStackTrace();
         }
     }*/
   
    
}
