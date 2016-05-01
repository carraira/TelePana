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
public interface AgendarCitaLocal {

    boolean agendarCita();

    String asignarConsultaMedico();

    String cambioEstadoCita();

    String centroAtencionSegunCiudad();

    String consultaMedicos();

    String consultarCita();

    boolean ingresarUsuarioCita();

    String modificarCita();

    boolean validarDisponibilidadMedico();

    boolean validarFechaCItaDisponible();
    
}
