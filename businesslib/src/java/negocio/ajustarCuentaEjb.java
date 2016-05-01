package negocio;

import entityes.Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class ajustarCuentaEjb extends Usuario implements AjustarCuentaLocal {

    @Override
  public boolean confirmarCambioCorreo() {
  return false;
  }

    @Override
  public String validacionNuevoCorreo() {
  return null;
  }

    @Override
  public boolean validarNuevaContrasena() {
  return false;
  }

    @Override
  public String autentificaContrasenaAntigua() {
  return null;
  }

    @Override
  public String ingresarAjustes() {
  return null;
  }

}