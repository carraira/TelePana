package negocio;


import SeasonBean.RegistroFacadeLocal;
import SeasonBean.UsuarioFacadeLocal;
import com.sun.xml.rpc.processor.util.StringUtils;
import entityes.Registro;
import entityes.Usuario;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
/**
 *
 * @author cabjr_000
 */
@Stateless
public class registroUsuariosEjb extends Registro implements RegistroUsuarioLocal {

   
  public String validarUsuarioNuevo(String user) {
      
      if (user!=null){
          info();
          return null;
      }
      
  return "Usuario Bien";
  }

  @Override
  public boolean correoNuevoValida( ) {
 
  return false;
  }

    @Override
  public boolean validaAfiliacion( ) {
  return false;
  }

    @Override
  public String confirmarContrasena( ) {
  return null;
  }

  
  
  

      @EJB
      public RegistroFacadeLocal FindId;
      @EJB
      public RegistroFacadeLocal editlogin;
      public RegistroFacadeLocal editpass;
      public RegistroFacadeLocal editcorreo;
      
//      public String editarUsuario(Usuario i, Usuario u, Usuario c, Usuario cr){
//          Usuario IdUsuarioConsulta;
//       
//          IdUsuarioConsulta = FindId.find(i.getIdUsuario());
//          
//          if(IdUsuarioConsulta == i){
//            
//          }
//      return "algo";
//          
//      }
      
      
public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Por favor ingresar usuario valido."));
    }

    @Override
    public String crearUsuarioConfirmado(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public String editarUsuario(Registro i){//, Registro u, Registro c, Registro cr ) {
      Registro IdUsuarioConsulta;
      
        IdUsuarioConsulta = FindId.find(i.getIdUsuario());
        
        if(IdUsuarioConsulta == null){
//             editlogin.create(u);
//             editpass.create(c);
//             editcorreo.create(cr);
             FindId.create(i);
             FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso, creacion Correcta", "Agregado"));
          }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso, Usuario Incorrecto o  Existe", "Usuario Existente"));
        }
      return "algo";
        
    }

 
   
}