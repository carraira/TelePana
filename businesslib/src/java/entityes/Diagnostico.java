/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.math.BigDecimal;



/**
 *
 * @author cabjr_000
 */

public class Diagnostico {
   
    private String codDiagnostico;
   
    private BigDecimal estaturaDiag;
   
    private Integer peso;
   
    private Short nivelGlucosa;
    
    private Short tensionDiag;
    
    private String diagSistema;
    
   

    public Diagnostico() {
    }

    public Diagnostico(String codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
    }

    public String getCodDiagnostico() {
        return codDiagnostico;
    }

    public void setCodDiagnostico(String codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
    }

    public BigDecimal getEstaturaDiag() {
        return estaturaDiag;
    }

    public void setEstaturaDiag(BigDecimal estaturaDiag) {
        this.estaturaDiag = estaturaDiag;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Short getNivelGlucosa() {
        return nivelGlucosa;
    }

    public void setNivelGlucosa(Short nivelGlucosa) {
        this.nivelGlucosa = nivelGlucosa;
    }

    public Short getTensionDiag() {
        return tensionDiag;
    }

    public void setTensionDiag(Short tensionDiag) {
        this.tensionDiag = tensionDiag;
    }

    public String getDiagSistema() {
        return diagSistema;
    }

    public void setDiagSistema(String diagSistema) {
        this.diagSistema = diagSistema;
    }

  
    
}
