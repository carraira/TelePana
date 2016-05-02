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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
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
@Table(name = "AFILIACION", catalog = "", schema = "ADMTELE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Afiliacion.findAll", query = "SELECT a FROM Afiliacion a"),
    @NamedQuery(name = "Afiliacion.findByFechaAfiliacion", query = "SELECT a FROM Afiliacion a WHERE a.fechaAfiliacion = :fechaAfiliacion"),
    @NamedQuery(name = "Afiliacion.findByEstadoAfiliacion", query = "SELECT a FROM Afiliacion a WHERE a.estadoAfiliacion = :estadoAfiliacion"),
    @NamedQuery(name = "Afiliacion.findByNumAfilicion", query = "SELECT a FROM Afiliacion a WHERE a.numAfilicion = :numAfilicion"),
    @NamedQuery(name = "Afiliacion.findByFechaFAfiliacion", query = "SELECT a FROM Afiliacion a WHERE a.fechaFAfiliacion = :fechaFAfiliacion"),
    @NamedQuery(name = "Afiliacion.findByIdUsuario", query = "SELECT a FROM Afiliacion a WHERE a.idUsuario = :idUsuario")})
public class Afiliacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_AFILIACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAfiliacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ESTADO_AFILIACION")
    private String estadoAfiliacion;
    @Column(name = "NUM_AFILICION")
    private Long numAfilicion;
    @Column(name = "FECHA_F_AFILIACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFAfiliacion;
    @Column(name = "ID_USUARIO")
    private Long idUsuario;

    public Afiliacion() {
    }

    public Afiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Afiliacion(Date fechaAfiliacion, String estadoAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
        this.estadoAfiliacion = estadoAfiliacion;
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public String getEstadoAfiliacion() {
        return estadoAfiliacion;
    }

    public void setEstadoAfiliacion(String estadoAfiliacion) {
        this.estadoAfiliacion = estadoAfiliacion;
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

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fechaAfiliacion != null ? fechaAfiliacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Afiliacion)) {
            return false;
        }
        Afiliacion other = (Afiliacion) object;
        if ((this.fechaAfiliacion == null && other.fechaAfiliacion != null) || (this.fechaAfiliacion != null && !this.fechaAfiliacion.equals(other.fechaAfiliacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Afiliacion[ fechaAfiliacion=" + fechaAfiliacion + " ]";
    }
    
}
