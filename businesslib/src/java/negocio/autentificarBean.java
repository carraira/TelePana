/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import javax.ejb.Stateless;
import entityes.Usuario;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class autentificarBean implements autentificarBeanLocal {

        public boolean autentico(Usuario usuario) {
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean autentico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
