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

public class Medico {
    
    private Long codMedico;
    
    private String tipoEspMedico;
   
    private String univMedico;
    
    private Short extMedico;
    
    private Short puntajeMed;
    
   

    public Medico() {
    }

    public Medico(Long codMedico) {
        this.codMedico = codMedico;
    }

    public Medico(Long codMedico, String tipoEspMedico) {
        this.codMedico = codMedico;
        this.tipoEspMedico = tipoEspMedico;
    }

    public Long getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(Long codMedico) {
        this.codMedico = codMedico;
    }

    public String getTipoEspMedico() {
        return tipoEspMedico;
    }

    public void setTipoEspMedico(String tipoEspMedico) {
        this.tipoEspMedico = tipoEspMedico;
    }

    public String getUnivMedico() {
        return univMedico;
    }

    public void setUnivMedico(String univMedico) {
        this.univMedico = univMedico;
    }

    public Short getExtMedico() {
        return extMedico;
    }

    public void setExtMedico(Short extMedico) {
        this.extMedico = extMedico;
    }

    public Short getPuntajeMed() {
        return puntajeMed;
    }

    public void setPuntajeMed(Short puntajeMed) {
        this.puntajeMed = puntajeMed;
    }
    

    
    
}
