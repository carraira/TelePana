package negocio;

import entityes.Adjuntos;
import javax.ejb.Stateless;

/**
 *
 * @author cabjr_000
 */
@Stateless

public class cargarAdjuntosEjb extends Adjuntos implements CargarAdjuntosLocal{

    @Override
  public boolean validarFormatoCarga() {
  return false;
  }

    @Override
  public String consultars() {
  return null;
  }

    @Override
  public String modificars(   ) {
  return null;
  }

    @Override
  public boolean eliminar(   ) {
  return false;
  }

    @Override
  public boolean ingresarAdjunto() {
  return false;
  }

}