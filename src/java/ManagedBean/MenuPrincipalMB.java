/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBean;


import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import negocio.autentificarBeanLocal;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author cabjr_000
 */
@ManagedBean
public class MenuPrincipalMB {
    
    
    
     public String ajusteCuenta(){
         return "inicioportal";
     }
    
    
    
    
}
