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

public class Historial {
   
    private Long codHistorial;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHistorial;
    
    private String comentariosHis;
    
    

    public Historial() {
    }

    public Historial(Long codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Historial(Long codHistorial, Date fechaHistorial) {
        this.codHistorial = codHistorial;
        this.fechaHistorial = fechaHistorial;
    }

    public Long getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(Long codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Date getFechaHistorial() {
        return fechaHistorial;
    }

    public void setFechaHistorial(Date fechaHistorial) {
        this.fechaHistorial = fechaHistorial;
    }

    public String getComentariosHis() {
        return comentariosHis;
    }

    public void setComentariosHis(String comentariosHis) {
        this.comentariosHis = comentariosHis;
    }

    
    
}
