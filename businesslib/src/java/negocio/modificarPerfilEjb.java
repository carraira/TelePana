package negocio;

import entityes.Usuario;
import java.sql.Blob;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless


public class modificarPerfilEjb extends Usuario implements ModificarPerfilLocal {

   
    @Override
  public String ingresarDatosPerfil( ) {
  return null;
  }

    @Override
  public Blob mostrarImagenPerfil( ) {
  return null;
  }

    @Override
  public String traerTipoPaciente( ) {
  return null;
  }

    @Override
  public boolean validarFechaActualNacer( ) {
  return false;
  }

    @Override
  public boolean cambiarImagenPerfil( ) {
  return false;
  }

    @Override
  public boolean comprobarDimensionImagen( ) {
  return false;
  }

    @Override
  public String mostrarListaConsulta( ) {
  return null;
  }

    @Override
  public String consultarCiudadPais( ) {
  return null;
  }

    @Override
  public boolean modifircarDatosPerfil( ) {
  return false;
  }

    @Override
  public String traerDatosPerfil( ) {
  return null;
  }

}