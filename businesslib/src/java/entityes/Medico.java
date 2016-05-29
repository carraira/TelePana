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
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m"),
    @NamedQuery(name = "Medico.findByCodMedico", query = "SELECT m FROM Medico m WHERE m.codMedico = :codMedico"),
    @NamedQuery(name = "Medico.findByTipoEspMedico", query = "SELECT m FROM Medico m WHERE m.tipoEspMedico = :tipoEspMedico"),
    @NamedQuery(name = "Medico.findByUnivMedico", query = "SELECT m FROM Medico m WHERE m.univMedico = :univMedico"),
    @NamedQuery(name = "Medico.findByPuntajeMed", query = "SELECT m FROM Medico m WHERE m.puntajeMed = :puntajeMed"),
    @NamedQuery(name = "Medico.findByExtMedico", query = "SELECT m FROM Medico m WHERE m.extMedico = :extMedico"),
    @NamedQuery(name = "Medico.findByDescripcionMedico", query = "SELECT m FROM Medico m WHERE m.descripcionMedico = :descripcionMedico")})
public class Medico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "COD_MEDICO")
    private Long codMedico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO_ESP_MEDICO")
    private String tipoEspMedico;
    @Size(max = 50)
    @Column(name = "UNIV_MEDICO")
    private String univMedico;
    @Column(name = "PUNTAJE_MED")
    private Short puntajeMed;
    @Column(name = "EXT_MEDICO")
    private Short extMedico;
    @Size(max = 200)
    @Column(name = "DESCRIPCION_MEDICO")
    private String descripcionMedico;
    @OneToMany(mappedBy = "codMedico")
    private List<Cita> citaList;
    @OneToMany(mappedBy = "medConsulta")
    private List<Historial> historialList;
    @JoinColumn(name = "COD_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario codUsuario;

    public Medico() {
    }

    public Medico(Long codMedico) {
        this.codMedico = codMedico;
    }

    public Medico(Long codMedico, String tipoEspMedico) {
        this.codMedico = codMedico;
        this.tipoEspMedico = tipoEspMedico;
    }

    public Long getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(Long codMedico) {
        this.codMedico = codMedico;
    }

    public String getTipoEspMedico() {
        return tipoEspMedico;
    }

    public void setTipoEspMedico(String tipoEspMedico) {
        this.tipoEspMedico = tipoEspMedico;
    }

    public String getUnivMedico() {
        return univMedico;
    }

    public void setUnivMedico(String univMedico) {
        this.univMedico = univMedico;
    }

    public Short getPuntajeMed() {
        return puntajeMed;
    }

    public void setPuntajeMed(Short puntajeMed) {
        this.puntajeMed = puntajeMed;
    }

    public Short getExtMedico() {
        return extMedico;
    }

    public void setExtMedico(Short extMedico) {
        this.extMedico = extMedico;
    }

    public String getDescripcionMedico() {
        return descripcionMedico;
    }

    public void setDescripcionMedico(String descripcionMedico) {
        this.descripcionMedico = descripcionMedico;
    }

    @XmlTransient
    public List<Cita> getCitaList() {
        return citaList;
    }

    public void setCitaList(List<Cita> citaList) {
        this.citaList = citaList;
    }

    @XmlTransient
    public List<Historial> getHistorialList() {
        return historialList;
    }

    public void setHistorialList(List<Historial> historialList) {
        this.historialList = historialList;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codMedico != null ? codMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.codMedico == null && other.codMedico != null) || (this.codMedico != null && !this.codMedico.equals(other.codMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Medico[ codMedico=" + codMedico + " ]";
    }
    
}
