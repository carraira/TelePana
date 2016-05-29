package negocio;


import SeasonBean.UsuarioFacadeLocal;
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
public class registroUsuariosEjb extends Usuario implements RegistroUsuarioLocal {

   
  public String validarUsuarioNuevo(String user) {
      
      if (user == null){
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
  public UsuarioFacadeLocal InsertoUsuario;
  
  
      public String crearUsuarioConfirmado(Usuario u ) {
      InsertoUsuario.create(u);
  return "Creado";
  }
public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Usuario Necesario."));
    }
}