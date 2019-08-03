/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.Clock;
import java.time.LocalDate;

/**
 *
 * @author Chino
 */

public class Historial {
    private Estado estado;
    private LocalDate fecha;
    private Usuario responsable;
    
    Historial(Estado estado,Usuario responsableHistorial){
        this.estado = estado;
        responsable = responsableHistorial;
        fecha = LocalDate.now(Clock.systemDefaultZone());
    }
    public void setEstado(Estado estado){
        this.estado = estado;
    }
    public Estado getEstado(){
        return estado;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public Usuario getResponsable(){
        return responsable;
    }
   
}
