package negocio;


import entityes.Usuario;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless
public class contrasenaRecuperarEjb extends Usuario implements ContrasenaRecuperarLocal {

    @Override
  public String envioCorreoRecuperar( ) {
  return null;
  }

    @Override
  public boolean autentificarCorreo( ) {
  return false;
  }

    @Override
  public String redireccionNuevoPassl( ) {
  return null;
  }

    @Override
  public boolean ingresoCorreoRecuperar( ) {
  return false;
  }

}