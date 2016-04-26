/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;


import java.util.Date;
import javax.persistence.Temporal;


/**
 *
 * @author cabjr_000
 */

public class Afiliacion {
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaAfiliacion;
    
    private Long numAfilicion;
   
  
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFAfiliacion;
    

    public Afiliacion() {
    }

    public Afiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Long getNumAfilicion() {
        return numAfilicion;
    }

    public void setNumAfilicion(Long numAfilicion) {
        this.numAfilicion = numAfilicion;
    }

    public Date getFechaFAfiliacion() {
        return fechaFAfiliacion;
    }

    public void setFechaFAfiliacion(Date fechaFAfiliacion) {
        this.fechaFAfiliacion = fechaFAfiliacion;
    }

    
    
}
