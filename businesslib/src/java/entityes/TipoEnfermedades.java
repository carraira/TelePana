/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cabjr_000
 */
@Entity
@Table(name = "TIPO_ENFERMEDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoEnfermedades.findAll", query = "SELECT t FROM TipoEnfermedades t"),
    @NamedQuery(name = "TipoEnfermedades.findByCodTipoEnfermedad", query = "SELECT t FROM TipoEnfermedades t WHERE t.codTipoEnfermedad = :codTipoEnfermedad"),
    @NamedQuery(name = "TipoEnfermedades.findByTipoEnfermedad", query = "SELECT t FROM TipoEnfermedades t WHERE t.tipoEnfermedad = :tipoEnfermedad")})
public class TipoEnfermedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_TIPO_ENFERMEDAD")
    private Long codTipoEnfermedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO_ENFERMEDAD")
    private String tipoEnfermedad;
    @OneToMany(mappedBy = "codTipoEnfermedad")
    private List<Enfermedades> enfermedadesList;

    public TipoEnfermedades() {
    }

    public TipoEnfermedades(Long codTipoEnfermedad) {
        this.codTipoEnfermedad = codTipoEnfermedad;
    }

    public TipoEnfermedades(Long codTipoEnfermedad, String tipoEnfermedad) {
        this.codTipoEnfermedad = codTipoEnfermedad;
        this.tipoEnfermedad = tipoEnfermedad;
    }

    public Long getCodTipoEnfermedad() {
        return codTipoEnfermedad;
    }

    public void setCodTipoEnfermedad(Long codTipoEnfermedad) {
        this.codTipoEnfermedad = codTipoEnfermedad;
    }

    public String getTipoEnfermedad() {
        return tipoEnfermedad;
    }

    public void setTipoEnfermedad(String tipoEnfermedad) {
        this.tipoEnfermedad = tipoEnfermedad;
    }

    @XmlTransient
    public List<Enfermedades> getEnfermedadesList() {
        return enfermedadesList;
    }

    public void setEnfermedadesList(List<Enfermedades> enfermedadesList) {
        this.enfermedadesList = enfermedadesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoEnfermedad != null ? codTipoEnfermedad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEnfermedades)) {
            return false;
        }
        TipoEnfermedades other = (TipoEnfermedades) object;
        if ((this.codTipoEnfermedad == null && other.codTipoEnfermedad != null) || (this.codTipoEnfermedad != null && !this.codTipoEnfermedad.equals(other.codTipoEnfermedad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.TipoEnfermedades[ codTipoEnfermedad=" + codTipoEnfermedad + " ]";
    }
    
}
