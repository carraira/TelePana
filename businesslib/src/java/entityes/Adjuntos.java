/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.io.Serializable;



/**
 *
 * @author cabjr_000
 */

public class Adjuntos {
   
    private String refAdjunto;
   
    private Serializable examenAdjunto;
    
    public Adjuntos() {
    }

    public Adjuntos(String refAdjunto) {
        this.refAdjunto = refAdjunto;
    }

    public String getRefAdjunto() {
        return refAdjunto;
    }

    public void setRefAdjunto(String refAdjunto) {
        this.refAdjunto = refAdjunto;
    }

    public Serializable getExamenAdjunto() {
        return examenAdjunto;
    }

    public void setExamenAdjunto(Serializable examenAdjunto) {
        this.examenAdjunto = examenAdjunto;
    }

   
    
}
