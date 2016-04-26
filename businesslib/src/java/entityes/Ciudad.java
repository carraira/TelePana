/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;



/**
 *
 * @author cabjr_000
 */

public class Ciudad {
   
    private Integer codPostal;
   
    private String nomCiudad;
    
  

    public Ciudad() {
    }

    public Ciudad(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public Ciudad(Integer codPostal, String nomCiudad) {
        this.codPostal = codPostal;
        this.nomCiudad = nomCiudad;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

  

    
    
}
