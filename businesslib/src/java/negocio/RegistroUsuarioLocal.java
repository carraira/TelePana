/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entityes.Usuario;

/**
 *
 * @author cabjr_000
 */
public interface RegistroUsuarioLocal {

    
    
    public String validarUsuarioNuevo(String user);
    
    
    
    String confirmarContrasena();

    boolean correoNuevoValida();

    public String crearUsuarioConfirmado(Usuario u);

    boolean validaAfiliacion();

    
    
}
