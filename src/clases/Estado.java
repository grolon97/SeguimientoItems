/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Chino
 */

public class Estado {
    private String estado;
    
    
    
    public Estado(){
        estado = "";
    }
    
    public Estado(String nombreEstado){
        estado = nombreEstado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getEstado(){
        return estado;
    }
    
}
