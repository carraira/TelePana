package negocio;


import entityes.Usuario;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless
public class registroUsuariosEjb extends Usuario implements RegistroUsuarioLocal {

    @Override
  public boolean validarUsuarioNuevo( ) {
  return false;
  }

    @Override
  public boolean correoNuevoValida( ) {
  return false;
  }

    @Override
  public boolean validaAfiliacion( ) {
  return false;
  }

    @Override
  public String confirmarContrasena( ) {
  return null;
  }

    @Override
  public boolean crearUsuarioConfirmado( ) {
  return false;
  }

}