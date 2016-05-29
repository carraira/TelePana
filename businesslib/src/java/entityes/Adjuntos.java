/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cabjr_000
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adjuntos.findAll", query = "SELECT a FROM Adjuntos a"),
    @NamedQuery(name = "Adjuntos.findByRefAdjunto", query = "SELECT a FROM Adjuntos a WHERE a.refAdjunto = :refAdjunto"),
    @NamedQuery(name = "Adjuntos.findByFechaAdjunto", query = "SELECT a FROM Adjuntos a WHERE a.fechaAdjunto = :fechaAdjunto"),
    @NamedQuery(name = "Adjuntos.findByDescripAdjunto", query = "SELECT a FROM Adjuntos a WHERE a.descripAdjunto = :descripAdjunto")})
public class Adjuntos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "REF_ADJUNTO")
    private String refAdjunto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_ADJUNTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdjunto;
    @Lob
    @Column(name = "EXAMEN_ADJUNTO")
    private Serializable examenAdjunto;
    @Size(max = 200)
    @Column(name = "DESCRIP_ADJUNTO")
    private String descripAdjunto;
    @OneToMany(mappedBy = "numAdjunto")
    private List<Historial> historialList;

    public Adjuntos() {
    }

    public Adjuntos(String refAdjunto) {
        this.refAdjunto = refAdjunto;
    }

    public Adjuntos(String refAdjunto, Date fechaAdjunto) {
        this.refAdjunto = refAdjunto;
        this.fechaAdjunto = fechaAdjunto;
    }

    public String getRefAdjunto() {
        return refAdjunto;
    }

    public void setRefAdjunto(String refAdjunto) {
        this.refAdjunto = refAdjunto;
    }

    public Date getFechaAdjunto() {
        return fechaAdjunto;
    }

    public void setFechaAdjunto(Date fechaAdjunto) {
        this.fechaAdjunto = fechaAdjunto;
    }

    public Serializable getExamenAdjunto() {
        return examenAdjunto;
    }

    public void setExamenAdjunto(Serializable examenAdjunto) {
        this.examenAdjunto = examenAdjunto;
    }

    public String getDescripAdjunto() {
        return descripAdjunto;
    }

    public void setDescripAdjunto(String descripAdjunto) {
        this.descripAdjunto = descripAdjunto;
    }

    @XmlTransient
    public List<Historial> getHistorialList() {
        return historialList;
    }

    public void setHistorialList(List<Historial> historialList) {
        this.historialList = historialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refAdjunto != null ? refAdjunto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adjuntos)) {
            return false;
        }
        Adjuntos other = (Adjuntos) object;
        if ((this.refAdjunto == null && other.refAdjunto != null) || (this.refAdjunto != null && !this.refAdjunto.equals(other.refAdjunto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Adjuntos[ refAdjunto=" + refAdjunto + " ]";
    }
    
}
