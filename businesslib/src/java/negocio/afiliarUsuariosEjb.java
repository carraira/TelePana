package negocio;

import entityes.Afiliacion;
import entityes.Usuario;
import javax.ejb.Stateless;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class afiliarUsuariosEjb implements AfiliarUsuariosLocal  {

    @Override
  public boolean crearAfiliacion( Afiliacion  Usuario) {
  return false;
  }

    @Override
  public void modificarAfiliacionfin() {
  }

    @Override
  public void consultarAfiliacion() {
  }

    @Override
  public void agregarUsuarioAfiliacion() {
  }

}