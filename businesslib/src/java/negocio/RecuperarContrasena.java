/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Stateless
public class RecuperarContrasena implements RecuperarContrasenaLocal {

    private List<String> correoValidos = new ArrayList<String>();

    @Override
    public String recuperacionPassword(String Correo) {

        correoValidos.add("capitanazo@gmail.com");
        correoValidos.add("capitanazo1@gmail.com");
        correoValidos.add("capitanazo2@gmail.com");
        correoValidos.add("capitanazo3@gmail.com");
        correoValidos.add("capitanazo4@gmail.com");

        if (Correo == null) {
            return "Correo No puede ser vacio";
        }

        if (!(Correo.contains("@") && Correo.contains(".com") )) {
            info();
            return "Caracteres no validos, ingrese nuevamente";
        }

        if (!(correoValidos.contains(Correo))) {
            return "Correo no Registrado";
        }
        return "Se ha enviado un mensaje al correo con la recuperacion";
    }
public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
    }
}
