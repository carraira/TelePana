/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author cabjr_000
 */
public interface RegistroUsuarioLocal {

    
    
    public String validarUsuarioNuevo(String user);
    
    
    
    String confirmarContrasena();

    boolean correoNuevoValida();

    boolean crearUsuarioConfirmado();

    boolean validaAfiliacion();

    
    
}
