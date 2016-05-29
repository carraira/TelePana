/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cabjr_000
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByConsCita", query = "SELECT c FROM Cita c WHERE c.consCita = :consCita"),
    @NamedQuery(name = "Cita.findByFechaSolCita", query = "SELECT c FROM Cita c WHERE c.fechaSolCita = :fechaSolCita"),
    @NamedQuery(name = "Cita.findByTipoCita", query = "SELECT c FROM Cita c WHERE c.tipoCita = :tipoCita"),
    @NamedQuery(name = "Cita.findByEstadoCita", query = "SELECT c FROM Cita c WHERE c.estadoCita = :estadoCita"),
    @NamedQuery(name = "Cita.findByFechaProgCita", query = "SELECT c FROM Cita c WHERE c.fechaProgCita = :fechaProgCita"),
    @NamedQuery(name = "Cita.findByDescripCita", query = "SELECT c FROM Cita c WHERE c.descripCita = :descripCita"),
    @NamedQuery(name = "Cita.findByCentroAtencion", query = "SELECT c FROM Cita c WHERE c.centroAtencion = :centroAtencion")})
public class Cita implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONS_CITA")
    private Long consCita;
    @Column(name = "FECHA_SOL_CITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSolCita;
    @Size(max = 10)
    @Column(name = "TIPO_CITA")
    private String tipoCita;
    @Size(max = 20)
    @Column(name = "ESTADO_CITA")
    private String estadoCita;
    @Column(name = "FECHA_PROG_CITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaProgCita;
    @Size(max = 100)
    @Column(name = "DESCRIP_CITA")
    private String descripCita;
    @Size(max = 20)
    @Column(name = "CENTRO_ATENCION")
    private String centroAtencion;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "COD_MEDICO", referencedColumnName = "COD_MEDICO")
    @ManyToOne
    private Medico codMedico;
    @JoinColumn(name = "COD_CIUDAD", referencedColumnName = "COD_POSTAL")
    @ManyToOne
    private Ciudad codCiudad;

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

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
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

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Medico getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(Medico codMedico) {
        this.codMedico = codMedico;
    }

    public Ciudad getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(Ciudad codCiudad) {
        this.codCiudad = codCiudad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consCita != null ? consCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.consCita == null && other.consCita != null) || (this.consCita != null && !this.consCita.equals(other.consCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Cita[ consCita=" + consCita + " ]";
    }
    
}
