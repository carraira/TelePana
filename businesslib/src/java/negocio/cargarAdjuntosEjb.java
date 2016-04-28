package negocio;

import entityes.Adjuntos;
import javax.ejb.Stateless;

/**
 *
 * @author cabjr_000
 */
@Stateless

public class cargarAdjuntosEjb extends Adjuntos{

  public boolean validarFormatoCarga() {
  return false;
  }

  public String consultars() {
  return null;
  }

  public String modificars(   ) {
  return null;
  }

  public boolean eliminar(   ) {
  return false;
  }

  public boolean ingresarAdjunto() {
  return false;
  }

}