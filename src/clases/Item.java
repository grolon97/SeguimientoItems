/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Chino
 */
public class Item {
    
    
    {
        historiales = new TreeMap<>();
    }
    
    
    private String nombre;
    private String prioridad;
    private Estado estadoActual;
    private Usuario responsableActual;
    private final Usuario usuarioCreador;
    private Proyecto proyecto;
    private final TreeMap<String,ArrayList<Historial>> historiales;
    private final TipoItem tipo;
    
    public Item(String nombreItem,TipoItem tipo,String prioridadItem,Usuario usuarioCreador){
        nombre = nombreItem;
        this.tipo = tipo;
        estadoActual = tipo.getEstadoInicial();
        responsableActual = null;
        prioridad = prioridadItem;
        this.usuarioCreador = usuarioCreador;
     }
    
    public Item(String nombreItem,TipoItem tipo,Usuario usuarioCreador){
        nombre = nombreItem;
        responsableActual = null;
        this.tipo = tipo;
        this.usuarioCreador = usuarioCreador;
    }
    
    public Usuario getCreadorItem(){
        return usuarioCreador;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Proyecto getProyecto(){
        return proyecto;
    }
    
    public void setProyecto(Proyecto proyecto){
        this.proyecto = proyecto;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }
    
    public TipoItem getTipo(){
        return tipo;
    } 
          
    public Estado getEstadoActual(){
        return estadoActual;
    }
    
    public Usuario getResponsable(){
        return responsableActual;
    }
    
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    private void guardarHistorial(){
      // se tiene que conseguir primero la colección del treeMap, y luego volver a ponerla
        String claveFecha = LocalDate.now().toString();
        ArrayList<Historial> a = new ArrayList<>();
        Historial nuevoHistorial = new Historial(estadoActual,responsableActual);
        if(historiales.containsKey(claveFecha)){
                  a = historiales.get(claveFecha);
                  a.add(nuevoHistorial);
                  historiales.put(claveFecha, a);
        }else{
                    a.add(nuevoHistorial);
                    historiales.put(claveFecha,a);
        }
    }
    
    public void cambiarEstado(Estado estado){
        guardarHistorial();
        this.estadoActual = estado;
        usuarioCreador.addAviso("El estado del ítem " + nombre + " ha cambiado al estado " + estadoActual.getEstado());
    }
    
    public void setResponsable(Usuario responsableItem){
  
        if(responsableActual == null){
            responsableActual = responsableItem;
        }else{
            cambiarResponsable(responsableItem);
        }
    }
    
    private void cambiarResponsable(Usuario nuevoResponsable){
        guardarHistorial();
        this.responsableActual = nuevoResponsable;
    }

    public ArrayList<Historial> getHistoriales(){
        ArrayList<Historial> retorno = new ArrayList<>();
       
       for (Map.Entry<String, ArrayList<Historial>> entry : historiales.entrySet()) {
              retorno.addAll(entry.getValue());
       }    
          return retorno;
    }
    
    
    public ArrayList<Usuario> getResponsablesByFecha(String nombreEstado,int dia,int mes, int ano){
        // buscar en la estructura de la manera más rápida posible
        ArrayList<Usuario> responsablesRetorno = new ArrayList<>();
        ArrayList<Historial> historialesFecha;
        String claveFecha = LocalDate.of(ano, mes, dia).toString();
        if(historiales.containsKey(claveFecha)){
           historialesFecha = historiales.get(claveFecha);
           for(Historial h:historialesFecha){
                Estado estadoHistorial = h.getEstado();
                if(estadoHistorial.getEstado().equals(nombreEstado)){
                    if(!(h.getResponsable() == null))
                    responsablesRetorno.add(h.getResponsable());
                }
           }
                  if(responsablesRetorno.isEmpty())
                           return null;
                  else    
                           return responsablesRetorno;
        }                  
                    return null;
    }
}
