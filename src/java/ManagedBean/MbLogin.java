

package ManagedBean;


import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import negocio.autentificarBeanLocal;

/**
 *
 * @author cabjr
 */
@ManagedBean

public class MbLogin {
 
    private String us;// get y set
    private String cont;
    @EJB
    private autentificarBeanLocal ejb;
    private final HttpServletRequest httpServletRequest; //request
    private final FacesContext faceContext; // acceder a vista de managedbean
    private FacesMessage facesMessage; //sirve para lanzar mensaje contexto vista
     
    public MbLogin() 
    {// inicializar nuestras variables
        faceContext=FacesContext.getCurrentInstance(); // consultores
        httpServletRequest=(HttpServletRequest)faceContext.getExternalContext().getRequest(); 
    }
     
    public String login()//logica para validar logueo sin necesidad de base de datos
    
    {
     if(ejb.autentico(us, cont)){
     httpServletRequest.getSession().setAttribute("sessionUsuario", us);//almacenar sesion
     facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Completo", null);// envio mensaje informacion de logeo
     faceContext.addMessage(null, facesMessage);//    
     return "inicioportal";    
     }else {
         facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario o Contraseña Errados o Vacios, Intente de Nuevo", null);//redireccionar al index con mensaje de error
         faceContext.addMessage(null, facesMessage);
         return null;
     }
     
//        if(us.equals("CORE") && cont.equals("1234"))
//        {
//            httpServletRequest.getSession().setAttribute("sessionUsuario", us);//almacenar sesion
//            facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Exitoso", null);// envio mensaje informacion de logeo
//            faceContext.addMessage(null, facesMessage);//
//            return "inicioportal";// retorna el string
//        }
//        else//caso contrario en que no se pueda logear
//        {
//            facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos Errados, intente de nuevo", null);//redireccionar al index con mensaje de error
//            faceContext.addMessage(null, facesMessage);
//            return "index";// regresar al index
//        }
     
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public String getUs() {
        return us;
    }

    public void setUs(String us) {
        this.us = us;
    }
 
    
   
    
    public String registrar(){
        return "Registro";
        
        
    }
    
    public String Recuperar(){
        return "Recuperar";
        
    }
     public String Menu(){
        return "inicioportal";
        
    }
     
     public String Menu1(){
        return "inicioportal";
        
    }
     public String logon(){
        return "index";
        
    } 
}
