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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Enfermedades.findAll", query = "SELECT e FROM Enfermedades e"),
    @NamedQuery(name = "Enfermedades.findByCodEnfermedades", query = "SELECT e FROM Enfermedades e WHERE e.codEnfermedades = :codEnfermedades"),
    @NamedQuery(name = "Enfermedades.findByNomEnfermedad", query = "SELECT e FROM Enfermedades e WHERE e.nomEnfermedad = :nomEnfermedad"),
    @NamedQuery(name = "Enfermedades.findByDiagEnfermedad", query = "SELECT e FROM Enfermedades e WHERE e.diagEnfermedad = :diagEnfermedad")})
public class Enfermedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_ENFERMEDADES")
    private Long codEnfermedades;
    @Size(max = 100)
    @Column(name = "NOM_ENFERMEDAD")
    private String nomEnfermedad;
    @Size(max = 150)
    @Column(name = "DIAG_ENFERMEDAD")
    private String diagEnfermedad;
    @OneToMany(mappedBy = "enfermedadDiag")
    private List<Diagnostico> diagnosticoList;
    @JoinColumn(name = "COD_TIPO_ENFERMEDAD", referencedColumnName = "COD_TIPO_ENFERMEDAD")
    @ManyToOne
    private TipoEnfermedades codTipoEnfermedad;

    public Enfermedades() {
    }

    public Enfermedades(Long codEnfermedades) {
        this.codEnfermedades = codEnfermedades;
    }

    public Long getCodEnfermedades() {
        return codEnfermedades;
    }

    public void setCodEnfermedades(Long codEnfermedades) {
        this.codEnfermedades = codEnfermedades;
    }

    public String getNomEnfermedad() {
        return nomEnfermedad;
    }

    public void setNomEnfermedad(String nomEnfermedad) {
        this.nomEnfermedad = nomEnfermedad;
    }

    public String getDiagEnfermedad() {
        return diagEnfermedad;
    }

    public void setDiagEnfermedad(String diagEnfermedad) {
        this.diagEnfermedad = diagEnfermedad;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    public TipoEnfermedades getCodTipoEnfermedad() {
        return codTipoEnfermedad;
    }

    public void setCodTipoEnfermedad(TipoEnfermedades codTipoEnfermedad) {
        this.codTipoEnfermedad = codTipoEnfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEnfermedades != null ? codEnfermedades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enfermedades)) {
            return false;
        }
        Enfermedades other = (Enfermedades) object;
        if ((this.codEnfermedades == null && other.codEnfermedades != null) || (this.codEnfermedades != null && !this.codEnfermedades.equals(other.codEnfermedades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Enfermedades[ codEnfermedades=" + codEnfermedades + " ]";
    }
    
}
