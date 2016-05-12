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
import negocio.RecuperarContrasenaLocal;

@ManagedBean

public class RecuperarMB {
    private String Correo;
    private FacesContext faceContext = null; // acceder a vista de managedbean
    private FacesMessage facesMessage1= null; //sirve para lanzar mensaje contexto vista
    private String mensaje;
    @EJB
    private RecuperarContrasenaLocal ejbrecuperar;
   public String RecuperaContrasena(){
       
       mensaje = ejbrecuperar.recuperacionPassword(Correo);
       faceContext=FacesContext.getCurrentInstance(); // consultores
       facesMessage1=new FacesMessage(FacesMessage.SEVERITY_ERROR,mensaje, null);//redireccionar al index con mensaje de error
       faceContext.addMessage(null, facesMessage1);
       return "Recuperar";
       
   }

   
   
   
   
   
   
   
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
   
}
