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

public class Cita {
    
    private Long consCita;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaSolCita;
    
    private String estadoCita;
   
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaProgCita;
  
    private String descripCita;
   
    private String centroAtencion;
   

    public Cita() {
    }

    public Cita(Long consCita) {
        this.consCita = consCita;
    }

    public Long getConsCita() {
        return consCita;
    }

    public void setConsCita(Long consCita) {
        this.consCita = consCita;
    }

    public Date getFechaSolCita() {
        return fechaSolCita;
    }

    public void setFechaSolCita(Date fechaSolCita) {
        this.fechaSolCita = fechaSolCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public Date getFechaProgCita() {
        return fechaProgCita;
    }

    public void setFechaProgCita(Date fechaProgCita) {
        this.fechaProgCita = fechaProgCita;
    }

    public String getDescripCita() {
        return descripCita;
    }

    public void setDescripCita(String descripCita) {
        this.descripCita = descripCita;
    }

    public String getCentroAtencion() {
        return centroAtencion;
    }

    public void setCentroAtencion(String centroAtencion) {
        this.centroAtencion = centroAtencion;
    }

   
    
}
