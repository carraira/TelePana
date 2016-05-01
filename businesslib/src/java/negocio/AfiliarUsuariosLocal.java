/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import entityes.Afiliacion;
import javax.ejb.Local;

/**
 *
 * @author cabjr_000
 */
@Local
public interface AfiliarUsuariosLocal {

    void agregarUsuarioAfiliacion();

    void consultarAfiliacion();

    boolean crearAfiliacion(Afiliacion Usuario);

    void modificarAfiliacionfin();
    
}
