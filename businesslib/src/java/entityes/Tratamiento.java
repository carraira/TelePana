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
    @NamedQuery(name = "Tratamiento.findAll", query = "SELECT t FROM Tratamiento t"),
    @NamedQuery(name = "Tratamiento.findByCodTratamiento", query = "SELECT t FROM Tratamiento t WHERE t.codTratamiento = :codTratamiento"),
    @NamedQuery(name = "Tratamiento.findByNomTratamiento", query = "SELECT t FROM Tratamiento t WHERE t.nomTratamiento = :nomTratamiento"),
    @NamedQuery(name = "Tratamiento.findByDescrpTratamiento", query = "SELECT t FROM Tratamiento t WHERE t.descrpTratamiento = :descrpTratamiento"),
    @NamedQuery(name = "Tratamiento.findByTipoTratamiento", query = "SELECT t FROM Tratamiento t WHERE t.tipoTratamiento = :tipoTratamiento"),
    @NamedQuery(name = "Tratamiento.findByDiasTratamiento", query = "SELECT t FROM Tratamiento t WHERE t.diasTratamiento = :diasTratamiento")})
public class Tratamiento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_TRATAMIENTO")
    private String codTratamiento;
    @Size(max = 100)
    @Column(name = "NOM_TRATAMIENTO")
    private String nomTratamiento;
    @Size(max = 200)
    @Column(name = "DESCRP_TRATAMIENTO")
    private String descrpTratamiento;
    @Size(max = 20)
    @Column(name = "TIPO_TRATAMIENTO")
    private String tipoTratamiento;
    @Size(max = 3)
    @Column(name = "DIAS_TRATAMIENTO")
    private String diasTratamiento;
    @OneToMany(mappedBy = "tratamientoDiag")
    private List<Diagnostico> diagnosticoList;

    public Tratamiento() {
    }

    public Tratamiento(String codTratamiento) {
        this.codTratamiento = codTratamiento;
    }

    public String getCodTratamiento() {
        return codTratamiento;
    }

    public void setCodTratamiento(String codTratamiento) {
        this.codTratamiento = codTratamiento;
    }

    public String getNomTratamiento() {
        return nomTratamiento;
    }

    public void setNomTratamiento(String nomTratamiento) {
        this.nomTratamiento = nomTratamiento;
    }

    public String getDescrpTratamiento() {
        return descrpTratamiento;
    }

    public void setDescrpTratamiento(String descrpTratamiento) {
        this.descrpTratamiento = descrpTratamiento;
    }

    public String getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(String tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public String getDiasTratamiento() {
        return diasTratamiento;
    }

    public void setDiasTratamiento(String diasTratamiento) {
        this.diasTratamiento = diasTratamiento;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTratamiento != null ? codTratamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tratamiento)) {
            return false;
        }
        Tratamiento other = (Tratamiento) object;
        if ((this.codTratamiento == null && other.codTratamiento != null) || (this.codTratamiento != null && !this.codTratamiento.equals(other.codTratamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Tratamiento[ codTratamiento=" + codTratamiento + " ]";
    }
    
}
