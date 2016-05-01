/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author cabjr
 */
@ManagedBean
@RequestScoped
public class MbLogin {
 
    private String us;// get y set
    private String cont= "1234";
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
     
     
        if(us.equals("CORE") && cont.equals("1234"))
        {
            httpServletRequest.getSession().setAttribute("sessionUsuario", us);//almacenar sesion
            facesMessage=new FacesMessage(FacesMessage.SEVERITY_INFO, "Acceso Exitoso", null);// envio mensaje informacion de logeo
            faceContext.addMessage(null, facesMessage);//
            return "inicioportal";// retorna el string
        }
        else//caso contrario en que no se pueda logear
        {
            facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Datos Errados, intente de nuevo", null);//redireccionar al index con mensaje de error
            faceContext.addMessage(null, facesMessage);
            return "index";// regresar al index
        }
     
    }
 
    
    public String getUsuario() {
        return us;
    }
 
    public void setUsuario(String usuario) {
        this.us = usuario;
    }
 
    public String getContrasenia() {
        return cont;
    }
 
    public void setContrasenia(String contrasenia) {
        this.cont = cont;
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
}
