package negocio;

import entityes.Historial;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless


public class mostrarPrescipcionEjb extends Historial implements MostrarPrescipcionLocal {

    @Override
  public String consultarMensajesMedico() {
  return null;
  }

    @Override
  public String mostrarMensajesRecientes() {
  return null;
  }

    @Override
  public boolean validarLecturaMensajes() {
  return false;
  }

    @Override
  public String actualizarMensajesPres() {
  return null;
  }

}