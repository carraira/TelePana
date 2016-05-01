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
public interface ContrasenaRecuperarLocal  {

    boolean autentificarCorreo();

    String envioCorreoRecuperar();

    boolean ingresoCorreoRecuperar();

    String redireccionNuevoPassl();
    
}
