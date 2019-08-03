/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import clases.Equipo;
import clases.Rol;
import clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Chino
 */
public class generadorUsuarios {
     public static ArrayList<Usuario> usuariosPrueba;
     public static ArrayList<Equipo> equiposPrueba;
     static {
         cargarUsuarios();
     }
     
     public static void cargarUsuarios(){
         
         usuariosPrueba = new ArrayList<>();
         
                  usuariosPrueba.add(new Usuario("grolon","password",Rol.ADMINISTRADOR));
                  usuariosPrueba.add(new Usuario("jzuniga","password",Rol.ADMINISTRADOR));
                  usuariosPrueba.add(new Usuario("rgonzalez","password",Rol.LIDER));
                  usuariosPrueba.add(new Usuario("yrodriguez","password",Rol.LIDER));
                  usuariosPrueba.add(new Usuario("msanchez","password",Rol.LIDER));
                  usuariosPrueba.add(new Usuario("jperez","password",Rol.RESPONSABLE));
                  usuariosPrueba.add(new Usuario("pgomez","password",Rol.RESPONSABLE));
                  usuariosPrueba.add(new Usuario("cruiz","password",Rol.RESPONSABLE));
                  usuariosPrueba.add(new Usuario("ahernandez","password",Rol.RESPONSABLE));
                  usuariosPrueba.add(new Usuario("rdiaz","password",Rol.RESPONSABLE));
                  usuariosPrueba.add(new Usuario("nmorales","password",Rol.RESPONSABLE));
                  
                  Equipo equipo1 = new Equipo("Equipo 1");
                             equipo1.addIntegrante(getUsuario("jperez"));
                             equipo1.addIntegrante(getUsuario("pgomez"));
                             equipo1.addIntegrante(getUsuario("cruiz"));
                  Equipo equipo2 = new Equipo("Equipo 2"); 
                             equipo2.addIntegrante(getUsuario("ahernandez"));
                             equipo2.addIntegrante(getUsuario("rdiaz"));
                             equipo2.addIntegrante(getUsuario("nmorales"));
                 equiposPrueba = new ArrayList<>();
                 equiposPrueba.add(equipo1);
                 equiposPrueba.add(equipo2);
     }
     
     public static void crearUsuario(Usuario nuevoUsuario){
         usuariosPrueba.add(nuevoUsuario);
     }
     
     public static void eliminarUsuario(String nombreUsuario){
         Usuario u = getUsuario(nombreUsuario);
                     eliminarUsuario(u);
            
     }
     
     public static Equipo getEquipo(String nombreEquipo){
         for(Equipo e:equiposPrueba){
              if(e.getNombre().equals(nombreEquipo)){
                  return e;
              }
         } 
                  return null;
     }
     
     public static ArrayList<Usuario> getUsuarios(){                             
         return usuariosPrueba;
     }
     
     public static boolean esUsuario(Usuario user){
         return usuariosPrueba.contains(user);
     }
     
     public static Usuario getUsuario(String nombreUsuario){
         
         for(Usuario u:usuariosPrueba){
             if(u.getNombre().equals(nombreUsuario))
                 return u;
         }
                return null;
     }
     
     public static Usuario getUsuario(String nombreUsuario,String contrasena){
         
         for(Usuario u:usuariosPrueba){
             if(u.getNombre().equals(nombreUsuario))
                 if(u.getContrasena().equals(contrasena))
                   return u;
         }
                return null;
     }
     
     public static ArrayList<Usuario> getLideres(){
      ArrayList<Usuario> usuariosRetorno = new ArrayList<>();   
         for(Usuario u:usuariosPrueba){
              if(u.getRol() == Rol.LIDER){
                  usuariosRetorno.add(u);
              }
         }
             return usuariosRetorno;
     }
        
     public static void eliminarUsuario(Usuario user){
         usuariosPrueba.remove(user);
     }
}
