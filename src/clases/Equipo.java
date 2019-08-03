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
public class Equipo {
     
    private String nombreEquipo;
    private ArrayList<Usuario> integrantes;
    
    
    {
         integrantes = new ArrayList<>();
    }
    
    public Equipo(){
        nombreEquipo = "";
    }
    public Equipo(String nombre){
        nombreEquipo = nombre;
    } 
    
    public ArrayList<Usuario> getIntegrantes(){
        return integrantes;
    }
    public void addIntegrante(Usuario nuevoIntegrante){
        integrantes.add(nuevoIntegrante);
    }
    public void eliminarIntegrante(String nombreIntegrante){
        boolean usuarioEncontrado = false;
        Usuario usuarioBuscado;
        int i = 0;
        do{
             usuarioBuscado = integrantes.get(i);
             if(usuarioBuscado.getNombre().equals(nombreIntegrante)){
                 usuarioEncontrado = true;
                 integrantes.remove(i);
             }
        }while((i<integrantes.size())&&(!(usuarioEncontrado)));    
     }
    
    public int getSize(){
        return integrantes.size();
    }
    public String getNombre(){
        return nombreEquipo;
    }
    public boolean esIntegrante(String nombreIntegrante){
        for(Usuario u:integrantes){
            if(u.getNombre().equals((nombreIntegrante)))
                return true;
        }
               return false;
    }
    
}
