/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import SeasonBean.PaisFacadeLocal;
import entityes.Pais;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author cabjr_000
 */
@Stateless
public class InsertarPaisEjemplo implements InsertarPaisEjemploLocal {

@EJB
  public PaisFacadeLocal creandoPais;    
    
    
    @Override
    public String CrearPais(Pais p) {
        
        Pais paisConsulta;
        //Validar si ya existe ese pais
        paisConsulta = creandoPais.find(p.getNomPais());
        if(paisConsulta==null)
            creandoPais.create(p);
        else
            System.out.println("Ya existe el pais");
                    
        return null;
       
    }
   
    
    
    
}
