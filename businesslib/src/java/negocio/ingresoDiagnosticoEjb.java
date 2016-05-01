package negocio;

import entityes.Diagnostico;
import javax.ejb.Stateless;
/**
 *
 * @author cabjr_000
 */
@Stateless


public class ingresoDiagnosticoEjb extends Diagnostico implements IngresoDiagnosticoLocal {

    @Override
  public Double calcularRitmo( ) {
  return null;
  }

    @Override
  public Double promediarPeso( ) {
  return null;
  }

    @Override
  public String predecirTension( ) {
  return null;
  }

    @Override
  public Double calcularGluco( ) {
  return null;
  }

    @Override
  public String generarReporte( ) {
  return null;
  }

    @Override
  public String modificarDiagnostico( ) {
  return null;
  }

    @Override
  public String capturaDatosReporte( ) {
  return null;
  }

    @Override
  public boolean ingresoAntecedentes( ) {
  return false;
  }

    @Override
  public String nuevoDiagnostico( ) {
  return null;
  }

}