/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBean;

import entityes.Registro;
import entityes.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author cabjr_000
 */
@ManagedBean
@ViewScoped
public class SesionesController implements Serializable{
    
    
    public void verificarSesion(){
        
        try {
            FacesContext context = FacesContext.getCurrentInstance();
//          Usuario us=  (Usuario)context.getExternalContext().getSessionMap().get("login");
          Registro us=  (Registro)context.getExternalContext().getSessionMap().get("login");
          if(us == null){
              context.getExternalContext().redirect("acceso.xhtml");
          }
        } catch (Exception e) {
            
        }
        
    }
}
