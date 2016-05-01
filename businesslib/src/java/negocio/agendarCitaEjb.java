package negocio;

import entityes.Cita;
import entityes.Ciudad;
import entityes.Medico;
import entityes.Usuario;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless


public class agendarCitaEjb implements AgendarCitaLocal {

    @Override
  public String consultaMedicos() {
  return null;
  }

    @Override
  public String cambioEstadoCita() {
  return null;
  }

    @Override
  public String centroAtencionSegunCiudad() {
  return null;
  }

    @Override
  public boolean agendarCita() {
  return false;
  }

    @Override
  public String modificarCita() {
  return null;
  }

    @Override
  public String consultarCita() {
  return null;
  }

    @Override
  public String asignarConsultaMedico( ) {
  return null;
  }

    @Override
  public boolean ingresarUsuarioCita() {
  return false;
  }

    @Override
  public boolean validarDisponibilidadMedico() {
  return false;
  }

    @Override
  public boolean validarFechaCItaDisponible() {
  return false;
  }

}