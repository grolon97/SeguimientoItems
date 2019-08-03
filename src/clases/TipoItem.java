/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Chino
 */
public class TipoItem {
    
    private String nombre;
    private ArrayList<Estado> secuenciaEstados;
    {
        secuenciaEstados = new ArrayList<>();
    }
    
    public TipoItem(String nombreTipo, Estado estadoInicial){
        nombre = nombreTipo;
        secuenciaEstados.add(estadoInicial);
    }
    
    public TipoItem(Estado estadoInicial){
        secuenciaEstados.add(estadoInicial);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Estado getEstadoInicial(){
        return secuenciaEstados.get(0);
    }
    
    public void addEstado(Estado nuevoEstado){
        secuenciaEstados.add(nuevoEstado);
    }
    
    public Estado getEstado(String nombreEstado){
        for(Estado e:secuenciaEstados){
            if(e.getEstado().equals(nombreEstado))
            return e;
        }
        return null;
    }
    
    public ArrayList<Estado> getEstados(){
        return secuenciaEstados;
    }
    
    public ArrayList<Estado> getEstadosSiguientes(Estado e){
       ArrayList<Estado> estadosSiguientes = new ArrayList<>(); 
       for(Estado es:secuenciaEstados){
            if(!(es.equals(e))){
                estadosSiguientes.add(es);
            }
       }
       return estadosSiguientes;
    }
    
    public void eliminarEstado(Estado estadoBorrar){
        secuenciaEstados.remove(estadoBorrar);
    }
}
