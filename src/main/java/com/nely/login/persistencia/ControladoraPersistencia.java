
package com.nely.login.persistencia;

import com.nely.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> traerUsuarios() {
        
        List<Usuario> listaUsuarios = usuJpa.findUsuarioEntities();
        return listaUsuarios;
        
        // SELECT * FROM USUARIOS
    }
    
}
