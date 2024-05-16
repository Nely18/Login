/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nely.login.logica;

import com.nely.login.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author Nelson Pared
 */
public class Controladora {
    ControladoraPersistencia controlPersi;// = new ControladoraPersistencia();
    
    public Controladora() {
        controlPersi = new ControladoraPersistencia();
    }
    
    
    public String validarUsuario(String usuario, String contrasenia) {
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersi.traerUsuarios();
        
        for(Usuario usu : listaUsuarios){
            
            if(usu.getNombreUsuario().equals(usuario)){
                
                if(usu.getContrasenia().equals(contrasenia)){
                    
                    mensaje = "Usuario y Contraseña correctos. Bienvenido/a!";
                    return mensaje;
                }else{
                    mensaje = "Contraseña incorrecta";
                    return mensaje;
                }
            }else{
                mensaje = "Usuario incorrecto";
                
            }
        }
        return mensaje;
    }
}
