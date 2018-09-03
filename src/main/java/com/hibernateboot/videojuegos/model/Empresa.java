
package com.hibernateboot.videojuegos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cas_r
 */

@Entity
@Table(name = "empresa")
public class Empresa {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpresa;
    private String nombreEmpresa;

    public Empresa() {
    }

    public Empresa(Integer idEmpresa, String nombreEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
}
