/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.sql.Blob;

/**
 *
 * @author cabjr_000
 */
public interface ModificarPerfilLocal {

    boolean cambiarImagenPerfil();

    boolean comprobarDimensionImagen();

    String consultarCiudadPais();

    String ingresarDatosPerfil();

    boolean modifircarDatosPerfil();

    Blob mostrarImagenPerfil();

    String mostrarListaConsulta();

    String traerDatosPerfil();

    String traerTipoPaciente();

    boolean validarFechaActualNacer();
    
}
