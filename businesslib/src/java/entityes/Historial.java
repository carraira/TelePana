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
    @NamedQuery(name = "Historial.findAll", query = "SELECT h FROM Historial h"),
    @NamedQuery(name = "Historial.findByCodHistorial", query = "SELECT h FROM Historial h WHERE h.codHistorial = :codHistorial"),
    @NamedQuery(name = "Historial.findByFechaHistorial", query = "SELECT h FROM Historial h WHERE h.fechaHistorial = :fechaHistorial"),
    @NamedQuery(name = "Historial.findByPrescripcionHis", query = "SELECT h FROM Historial h WHERE h.prescripcionHis = :prescripcionHis"),
    @NamedQuery(name = "Historial.findByComentUsHistorial", query = "SELECT h FROM Historial h WHERE h.comentUsHistorial = :comentUsHistorial")})
public class Historial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_HISTORIAL")
    private Long codHistorial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HISTORIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHistorial;
    @Size(max = 200)
    @Column(name = "PRESCRIPCION_HIS")
    private String prescripcionHis;
    @Size(max = 300)
    @Column(name = "COMENT_US_HISTORIAL")
    private String comentUsHistorial;
    @JoinColumn(name = "MED_CONSULTA", referencedColumnName = "COD_MEDICO")
    @ManyToOne
    private Medico medConsulta;
    @JoinColumn(name = "NUM_DIAGNOSTICO", referencedColumnName = "COD_DIAGNOSTICO")
    @ManyToOne
    private Diagnostico numDiagnostico;
    @JoinColumn(name = "NUM_ADJUNTO", referencedColumnName = "REF_ADJUNTO")
    @ManyToOne
    private Adjuntos numAdjunto;

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

    public String getPrescripcionHis() {
        return prescripcionHis;
    }

    public void setPrescripcionHis(String prescripcionHis) {
        this.prescripcionHis = prescripcionHis;
    }

    public String getComentUsHistorial() {
        return comentUsHistorial;
    }

    public void setComentUsHistorial(String comentUsHistorial) {
        this.comentUsHistorial = comentUsHistorial;
    }

    public Medico getMedConsulta() {
        return medConsulta;
    }

    public void setMedConsulta(Medico medConsulta) {
        this.medConsulta = medConsulta;
    }

    public Diagnostico getNumDiagnostico() {
        return numDiagnostico;
    }

    public void setNumDiagnostico(Diagnostico numDiagnostico) {
        this.numDiagnostico = numDiagnostico;
    }

    public Adjuntos getNumAdjunto() {
        return numAdjunto;
    }

    public void setNumAdjunto(Adjuntos numAdjunto) {
        this.numAdjunto = numAdjunto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codHistorial != null ? codHistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historial)) {
            return false;
        }
        Historial other = (Historial) object;
        if ((this.codHistorial == null && other.codHistorial != null) || (this.codHistorial != null && !this.codHistorial.equals(other.codHistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Historial[ codHistorial=" + codHistorial + " ]";
    }
    
}
