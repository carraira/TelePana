/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author cabjr_000
 */
public interface IngresoDiagnosticoLocal {

    Double calcularGluco();

    Double calcularRitmo();

    String capturaDatosReporte();

    String generarReporte();

    boolean ingresoAntecedentes();

    String modificarDiagnostico();

    String nuevoDiagnostico();

    String predecirTension();

    Double promediarPeso();
    
}
