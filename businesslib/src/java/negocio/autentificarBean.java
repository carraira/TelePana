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

    @Override
    public boolean autentico(String Us, String Cont) {
      return "admin".equals(Us) && "pass".equals(Cont);
    }

    
    }

 