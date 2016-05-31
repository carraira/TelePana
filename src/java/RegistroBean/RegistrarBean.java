/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RegistroBean;

import entityes.Registro;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import negocio.RegistroUsuarioLocal;

/**
 *
 * @author cabjr_000
 */@ManagedBean(name = "registrarBean")
public class RegistrarBean {
     
     @EJB
     private RegistroUsuarioLocal insertoRegistro;
     @EJB
     private RegistroUsuarioLocal insertoLogin;
     
     private String idInsert;
     private String loginInsert;
     private String passInsert;
     private String correoInsert;

    public String getLoginInsert() {
        return loginInsert;
    }

    public void setLoginInsert(String loginInsert) {
        this.loginInsert = loginInsert;
    }
     
     
    Registro id = new Registro();
     Registro login = new Registro();
     Registro pass = new Registro();
     Registro correo = new Registro();
     
     
     
     
     public String insertarRegistro (){
         
         
         
  idInsert = insertoRegistro.editarUsuario(login);
//         passInsert
//         correoInsert

         return null;
         
     }
     
     
     
     
     
     

   

    public Registro getLogin() {
        return login;
    }

    public void setLogin(Registro login) {
        this.login = login;
    }

    public Registro getPass() {
        return pass;
    }

    public void setPass(Registro pass) {
        this.pass = pass;
    }

    public Registro getCorreo() {
        return correo;
    }

    public void setCorreo(Registro correo) {
        this.correo = correo;
    }
     
     
     
     
     
     
     
     
    
    
}
