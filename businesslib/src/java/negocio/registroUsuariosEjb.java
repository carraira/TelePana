package negocio;


import entityes.Usuario;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless
public class registroUsuariosEjb extends Usuario {

  public boolean validarUsuarioNuevo( ) {
  return false;
  }

  public boolean correoNuevoValida( ) {
  return false;
  }

  public boolean validaAfiliacion( ) {
  return false;
  }

  public String confirmarContrasena( ) {
  return null;
  }

  public boolean crearUsuarioConfirmado( ) {
  return false;
  }

}