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
    @NamedQuery(name = "Ciudad.findAll", query = "SELECT c FROM Ciudad c"),
    @NamedQuery(name = "Ciudad.findByCodPostal", query = "SELECT c FROM Ciudad c WHERE c.codPostal = :codPostal"),
    @NamedQuery(name = "Ciudad.findByNomCiudad", query = "SELECT c FROM Ciudad c WHERE c.nomCiudad = :nomCiudad")})
public class Ciudad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_POSTAL")
    private Integer codPostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "NOM_CIUDAD")
    private String nomCiudad;
    @OneToMany(mappedBy = "codCiudad")
    private List<Cita> citaList;
    @OneToMany(mappedBy = "codPostal")
    private List<Usuario> usuarioList;
    @JoinColumn(name = "COD_PAIS", referencedColumnName = "NOM_PAIS")
    @ManyToOne
    private Pais codPais;

    public Ciudad() {
    }

    public Ciudad(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public Ciudad(Integer codPostal, String nomCiudad) {
        this.codPostal = codPostal;
        this.nomCiudad = nomCiudad;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    @XmlTransient
    public List<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(List<Cita> citaList) {
        this.citaList = citaList;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public Pais getCodPais() {
        return codPais;
    }

    public void setCodPais(Pais codPais) {
        this.codPais = codPais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPostal != null ? codPostal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ciudad)) {
            return false;
        }
        Ciudad other = (Ciudad) object;
        if ((this.codPostal == null && other.codPostal != null) || (this.codPostal != null && !this.codPostal.equals(other.codPostal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Ciudad[ codPostal=" + codPostal + " ]";
    }
    
}
