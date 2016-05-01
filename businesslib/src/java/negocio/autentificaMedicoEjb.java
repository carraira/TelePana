package negocio;


import entityes.Usuario;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless
public class autentificaMedicoEjb extends Usuario implements AutentificaMedicoLocal {

    @Override
  public String mostrarEspecialidad() {
  return null;
  }

    @Override
  public String consultarComentarios() {
  return null;
  }

    @Override
  public double obtenerPuntajeMedico() {
  return 0.0;
  }

    @Override
  public String ingresarDescripcion() {
  return null;
  }

    @Override
  public boolean consultarMedico() {
  return false;
  }

    @Override
  public String listarPerfilMedico() {
  return null;
  }

    @Override
  public String mostrarTipoMedico() {
  return null;
  }

    @Override
  public String listarInformacionMedico() {
  return null;
  }

}