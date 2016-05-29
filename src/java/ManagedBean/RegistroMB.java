package ManagedBean;

import entityes.Usuario;
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
    private String userinsertar;
    Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @EJB
    private RegistroUsuarioLocal ejbvalidaruser;
    @EJB
    private RegistroUsuarioLocal ejbingresousario;

    public String validarUsuario() {

        usermensaje = ejbvalidaruser.validarUsuarioNuevo(user);

        return "Registro";
    }

    public String InsertarUsuario() {

//        usuario.setIdUsuario(Long.MIN_VALUE);
        
        userinsertar = ejbingresousario.crearUsuarioConfirmado(usuario);
        return null;

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
