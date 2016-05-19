

package ManagedBean;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import negocio.RegistroUsuarioLocal;
/**
 *
 * @author cabjr_000
 */
@ManagedBean
public class RegistroMB {
    private String user;
     private String usermensaje;
    @EJB
    private RegistroUsuarioLocal ejbvalidaruser;
    
 public String validarUsuario(){
     
     usermensaje = ejbvalidaruser.validarUsuarioNuevo(user);
     
      return "Registro";
 }   
    
    
    
    
    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
