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
public interface AutentificaMedicoLocal {

    String consultarComentarios();

    boolean consultarMedico();

    String ingresarDescripcion();

    String listarInformacionMedico();

    String listarPerfilMedico();

    String mostrarEspecialidad();

    String mostrarTipoMedico();

    double obtenerPuntajeMedico();
    
}
