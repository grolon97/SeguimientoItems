/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.LinkedList;

/**
 *
 * @author Chino
 */

public class Proyecto {
    
    private String nombre;
    private Usuario liderProyecto;
    private LinkedList<Item> items;
    private Equipo equipoProyecto;
    
    {
        items = new LinkedList<>();
    }
    
    public Proyecto(String nombre){
        this.nombre = nombre;
    }
    
    public Proyecto(String nombre, Usuario liderProyecto) {
        this.nombre = nombre;
        this.liderProyecto = liderProyecto;
    }
    
    public void setNombre(String nombreProyecto){
        nombre = nombreProyecto;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setLider(Usuario lider){
        liderProyecto = lider;
    }
    
    public Usuario getLider(){
        return liderProyecto;
    }
    
    public void setEquipo(Equipo equipo){
        equipoProyecto = equipo;
    }
    
    public Equipo getEquipo(){
        return equipoProyecto;
    }
    
    public void addItem(Item itemProyecto){
        itemProyecto.setProyecto(this);
        items.add(itemProyecto);
    }
    
    public int getIndexOfItem(String nombreItem){
         int i = 0;
         for(Item it:items){
             if(it.getNombre().equals(nombreItem))
                  return i;
             else{
                  i++;
             }
         }
             return -1;        
    }
            
    public Item getItem(String nombreItem){
         for(Item it:items){
                  if(it.getNombre().equals(nombreItem)){
                     return it;
                  }
         }
                  return null;
    }
    
    public void eliminarItem(Item itemBorrar){
        items.remove(itemBorrar);
    }
    
    public void actualizarNombreItem(Item itemAnterior,Item itemActualizado){
      // el nuevo item va a "heredar" los estados y sus historiales
        addItem(itemActualizado);
    }
    
    public void eliminarItem(String nombreItemBorrar){
        
        boolean itemEncontrado = false;
        Item itemBuscado;
        int i = 0;
        do{
             itemBuscado = items.get(i);
             System.out.println("i = " + i);
             if(itemBuscado.getNombre().equals(nombreItemBorrar)){
                 itemEncontrado = true;
                 items.remove(i);
             }
             i++;
        }while((i<items.size())&&(!(itemEncontrado)));
        
    }
    
    public LinkedList<Item> getItems(){
        return items;
    }
    
}
