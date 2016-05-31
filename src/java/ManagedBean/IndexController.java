/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ManagedBean;

import SeasonBean.RegistroFacadeLocal;
import SeasonBean.UsuarioFacadeLocal;
import entityes.Registro;
import entityes.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author cabjr_000
 */
@ManagedBean
@SessionScoped
public class IndexController implements Serializable{
    
    private Registro login;
    @EJB
    private RegistroFacadeLocal EJBRegistro;
//    private UsuarioFacadeLocal EJBUsuario;
   
    @PostConstruct
    public void init(){
       login = new Registro();
        
    }

    public Registro getLogin() {
        return login;
    }

    public void setLogin(Registro login) {
        this.login = login;
    }

 
    
    public String iniciarSesion() {
        Registro us;
        String redireccion = null;
        try {
            us = EJBRegistro.iniciarSesion(login);
            if (us != null) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("login", us);
                redireccion = "inicioportal.xhtml";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso, Usuario Incorrecto o no Existe", "Usuario invalido"));
            }

        } catch (Exception e) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso Error de sesion", "Error"));

        }
        return redireccion;
    }
}
