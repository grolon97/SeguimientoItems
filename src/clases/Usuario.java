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
public class Usuario {
    private String nombre;
    private String contrasena;
    private Rol rol;
    private ArrayList<String> avisos;    
    
    
    public Usuario(String nombreUsuario, String contrasena,Rol rolUsuario){
        nombre = nombreUsuario;
        this.contrasena = contrasena;
        rol = rolUsuario;
        avisos = new ArrayList<>();
    }
    
    public Usuario(String nombreUsuario,String contrasena, String rolUsuario){
        
        nombre = nombreUsuario;
        this.contrasena = contrasena;
        
        switch (rolUsuario) {
            case "ADMINISTRADOR":
                rol = Rol.ADMINISTRADOR;
                break;
            case "LIDER":
                rol = Rol.LIDER;
                break;
            case "RESPONSABLE":
                rol = Rol.RESPONSABLE;
                break;
            default:
                rol = null;
        }
        
        avisos = new ArrayList<>(); 
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public String getContrasena(){
        return contrasena;
    }
    public Rol getRol(){
        return rol;
    }
    public void addAviso(String nuevoAviso){
        avisos.add(nuevoAviso);
    }
    public ArrayList<String> getAvisos(){
        return avisos;
    }
    public void borrarAvisos(){
        avisos.clear();
    }
}
