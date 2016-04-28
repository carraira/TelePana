package negocio;


import entityes.Usuario;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless
public class contrasenaRecuperarEjb extends Usuario {

  public String envioCorreoRecuperar( ) {
  return null;
  }

  public boolean autentificarCorreo( ) {
  return false;
  }

  public String redireccionNuevoPassl( ) {
  return null;
  }

  public boolean ingresoCorreoRecuperar( ) {
  return false;
  }

}