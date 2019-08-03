/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import clases.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Chino
 */

public class generadorProyectos {
    
    private static ArrayList<TipoItem> tiposItemPrueba;
    private static ArrayList<Item> itemsPrueba;
    private static HashMap<String,Proyecto> proyectosPrueba;
    
    static {
        tiposItemPrueba = new ArrayList<>();
        itemsPrueba = new ArrayList<>();
        proyectosPrueba = new HashMap<>();
        cargarTiposItem();
        cargarProyectos();    
    }
    
    public static void cargarTiposItem(){
        
         TipoItem bug = new TipoItem("Bug", new Estado("Preparacion"));
                      bug.addEstado(new Estado("Desarrollo"));
                      bug.addEstado(new Estado("Correccion"));
                      bug.addEstado(new Estado("Mantenimiento"));
                      
         TipoItem reporte = new TipoItem("Reporte", new Estado("En espera"));
                      reporte.addEstado(new Estado("En desarrollo"));
                      reporte.addEstado(new Estado("Terminado"));
                      reporte.addEstado(new Estado("Entregado"));
                      
         TipoItem prueba = new TipoItem("Prueba",new Estado("Creado"));
                      prueba.addEstado(new Estado("En desarrollo"));
                      prueba.addEstado(new Estado("Validación"));
                      prueba.addEstado(new Estado("Terminado"));
         
         tiposItemPrueba.add(bug);
         tiposItemPrueba.add(reporte);
         tiposItemPrueba.add(prueba);
    }
    
    public static TipoItem getTipoItem(String nombreTipoItem){
        for(TipoItem ti:tiposItemPrueba){
            if(ti.getNombre().equals(nombreTipoItem))
                return ti;
        }
         return null;
    }
    
    public static  ArrayList<TipoItem> getTiposItem(){
        return tiposItemPrueba;
    }
    
    public static Item getItem(String nombreItem){
         for(Item it:itemsPrueba){
            if(it.getNombre().equals(nombreItem))
                return it;
        }
         return null;
    }
    
    public static void cargarProyectos(){
        
         Proyecto proyecto1 = new Proyecto("Proyecto1",generadorUsuarios.getUsuario("rgonzalez"));
                           proyecto1.addItem(new Item("Bug1",getTipoItem("Bug"),"ALTA",generadorUsuarios.getUsuario("rgonzalez")));
                           proyecto1.addItem(new Item("Bug2",getTipoItem("Bug"),"MEDIA",generadorUsuarios.getUsuario("yrodriguez")));
                           proyecto1.addItem(new Item("Reporte1",getTipoItem("Reporte"),"MEDIA",generadorUsuarios.getUsuario("jzuniga")));
                           proyecto1.addItem(new Item("Prueba1",getTipoItem("Prueba"),"BAJA",generadorUsuarios.getUsuario("rgonzalez")));
                           proyecto1.setEquipo(generadorUsuarios.getEquipo("Equipo 1"));
                           
         Proyecto proyecto2 = new Proyecto("Proyecto2",generadorUsuarios.getUsuario("yrodriguez"));
                           proyecto2.addItem(new Item("Bug3",getTipoItem("Bug"),"BAJA",generadorUsuarios.getUsuario("pgomez")));
                           proyecto2.addItem(new Item("Bug4",getTipoItem("Bug"),"MEDIA",generadorUsuarios.getUsuario("cruiz")));
                           proyecto2.addItem(new Item("Reporte2",getTipoItem("Reporte"),"ALTA",generadorUsuarios.getUsuario("ahernandez")));
                           proyecto2.addItem(new Item("Prueba2",getTipoItem("Prueba"),"BAJA",generadorUsuarios.getUsuario("rdiaz")));
                           proyecto2.addItem(new Item("Prueba3",getTipoItem("Prueba"),"MEDIA",generadorUsuarios.getUsuario("yrodriguez")));
                           proyecto2.setEquipo(generadorUsuarios.getEquipo("Equipo 2"));
                           
         proyectosPrueba.put(proyecto1.getNombre(), proyecto1);
         proyectosPrueba.put(proyecto2.getNombre(),proyecto2);
         
    }
    
    public static ArrayList<Proyecto> getProyectosAsArrayList(){
        ArrayList<Proyecto> retorno = new ArrayList<>();
        for(Map.Entry<String, Proyecto> entry : proyectosPrueba.entrySet()) {
             String clave = entry.getKey();
             Proyecto valor = entry.getValue();

             retorno.add(valor);
        }
        return retorno;
    }
    
    public static Proyecto getProyecto(String nombreProyecto){
        return proyectosPrueba.get(nombreProyecto);
    }     
    
    public static void eliminarProyecto(String nombreProyecto){
        proyectosPrueba.remove(nombreProyecto);
    }
    
    public static void setProyecto(Proyecto nuevoProyecto){
        proyectosPrueba.put(nuevoProyecto.getNombre(),nuevoProyecto);
    }
    
}
