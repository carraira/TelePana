package negocio;

import entityes.Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class ajustarCuentaEjb extends Usuario {

  public boolean confirmarCambioCorreo() {
  return false;
  }

  public String validacionNuevoCorreo() {
  return null;
  }

  public boolean validarNuevaContrasena() {
  return false;
  }

  public String autentificaContrasenaAntigua() {
  return null;
  }

  public String ingresarAjustes() {
  return null;
  }

}