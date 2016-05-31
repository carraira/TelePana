/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBean;

import entityes.Pais;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import negocio.InsertarPaisEjemploLocal;

/**
 *
 * @author cabjr_000
 */
@ManagedBean(name = "ejemploPaisMB")
public class EjemploPaisMB {

    @EJB
    private InsertarPaisEjemploLocal insertoPais;

    private String GuardaPais;
    
    Pais pais = new Pais();

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String creacionPais() {

        GuardaPais = insertoPais.CrearPais(pais);

        return null;

    }

}
