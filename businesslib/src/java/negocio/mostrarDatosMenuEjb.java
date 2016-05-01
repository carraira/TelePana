package negocio;

import entityes.Usuario;
import java.sql.Blob;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless


public class mostrarDatosMenuEjb extends Usuario implements MostrarDatosMenuLocal{

    @Override
  public Blob mostrarFotoPerfil() {
  return null;
  }

    @Override
  public String traerdatosGraficos() {
  return null;
  }

    @Override
  public String mostrarUsuarioConexion() {
  return null;
  }

}