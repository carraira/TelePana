/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.io.Serializable;
import java.math.BigDecimal;
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
    @NamedQuery(name = "Diagnostico.findAll", query = "SELECT d FROM Diagnostico d"),
    @NamedQuery(name = "Diagnostico.findByCodDiagnostico", query = "SELECT d FROM Diagnostico d WHERE d.codDiagnostico = :codDiagnostico"),
    @NamedQuery(name = "Diagnostico.findByEstaturaDiag", query = "SELECT d FROM Diagnostico d WHERE d.estaturaDiag = :estaturaDiag"),
    @NamedQuery(name = "Diagnostico.findByPeso", query = "SELECT d FROM Diagnostico d WHERE d.peso = :peso"),
    @NamedQuery(name = "Diagnostico.findByNivelGlucosa", query = "SELECT d FROM Diagnostico d WHERE d.nivelGlucosa = :nivelGlucosa"),
    @NamedQuery(name = "Diagnostico.findByTensionDiag", query = "SELECT d FROM Diagnostico d WHERE d.tensionDiag = :tensionDiag"),
    @NamedQuery(name = "Diagnostico.findByDiagSistema", query = "SELECT d FROM Diagnostico d WHERE d.diagSistema = :diagSistema"),
    @NamedQuery(name = "Diagnostico.findByCancer", query = "SELECT d FROM Diagnostico d WHERE d.cancer = :cancer"),
    @NamedQuery(name = "Diagnostico.findByAsma", query = "SELECT d FROM Diagnostico d WHERE d.asma = :asma"),
    @NamedQuery(name = "Diagnostico.findByCardiaca", query = "SELECT d FROM Diagnostico d WHERE d.cardiaca = :cardiaca"),
    @NamedQuery(name = "Diagnostico.findByDiabetes", query = "SELECT d FROM Diagnostico d WHERE d.diabetes = :diabetes"),
    @NamedQuery(name = "Diagnostico.findByAnemia", query = "SELECT d FROM Diagnostico d WHERE d.anemia = :anemia"),
    @NamedQuery(name = "Diagnostico.findByGlicemia", query = "SELECT d FROM Diagnostico d WHERE d.glicemia = :glicemia"),
    @NamedQuery(name = "Diagnostico.findByMuscular", query = "SELECT d FROM Diagnostico d WHERE d.muscular = :muscular"),
    @NamedQuery(name = "Diagnostico.findByGastritis", query = "SELECT d FROM Diagnostico d WHERE d.gastritis = :gastritis")})
public class Diagnostico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_DIAGNOSTICO")
    private String codDiagnostico;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTATURA_DIAG")
    private BigDecimal estaturaDiag;
    private Integer peso;
    @Column(name = "NIVEL_GLUCOSA")
    private Short nivelGlucosa;
    @Column(name = "TENSION_DIAG")
    private Short tensionDiag;
    @Size(max = 200)
    @Column(name = "DIAG_SISTEMA")
    private String diagSistema;
    private Character cancer;
    private Character asma;
    private Character cardiaca;
    private Character diabetes;
    private Character anemia;
    private Character glicemia;
    private Character muscular;
    private Character gastritis;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne
    private Usuario idUsuario;
    @JoinColumn(name = "TRATAMIENTO_DIAG", referencedColumnName = "COD_TRATAMIENTO")
    @ManyToOne
    private Tratamiento tratamientoDiag;
    @JoinColumn(name = "ENFERMEDAD_DIAG", referencedColumnName = "COD_ENFERMEDADES")
    @ManyToOne
    private Enfermedades enfermedadDiag;
    @OneToMany(mappedBy = "numDiagnostico")
    private List<Historial> historialList;

    public Diagnostico() {
    }

    public Diagnostico(String codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
    }

    public String getCodDiagnostico() {
        return codDiagnostico;
    }

    public void setCodDiagnostico(String codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
    }

    public BigDecimal getEstaturaDiag() {
        return estaturaDiag;
    }

    public void setEstaturaDiag(BigDecimal estaturaDiag) {
        this.estaturaDiag = estaturaDiag;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Short getNivelGlucosa() {
        return nivelGlucosa;
    }

    public void setNivelGlucosa(Short nivelGlucosa) {
        this.nivelGlucosa = nivelGlucosa;
    }

    public Short getTensionDiag() {
        return tensionDiag;
    }

    public void setTensionDiag(Short tensionDiag) {
        this.tensionDiag = tensionDiag;
    }

    public String getDiagSistema() {
        return diagSistema;
    }

    public void setDiagSistema(String diagSistema) {
        this.diagSistema = diagSistema;
    }

    public Character getCancer() {
        return cancer;
    }

    public void setCancer(Character cancer) {
        this.cancer = cancer;
    }

    public Character getAsma() {
        return asma;
    }

    public void setAsma(Character asma) {
        this.asma = asma;
    }

    public Character getCardiaca() {
        return cardiaca;
    }

    public void setCardiaca(Character cardiaca) {
        this.cardiaca = cardiaca;
    }

    public Character getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Character diabetes) {
        this.diabetes = diabetes;
    }

    public Character getAnemia() {
        return anemia;
    }

    public void setAnemia(Character anemia) {
        this.anemia = anemia;
    }

    public Character getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(Character glicemia) {
        this.glicemia = glicemia;
    }

    public Character getMuscular() {
        return muscular;
    }

    public void setMuscular(Character muscular) {
        this.muscular = muscular;
    }

    public Character getGastritis() {
        return gastritis;
    }

    public void setGastritis(Character gastritis) {
        this.gastritis = gastritis;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Tratamiento getTratamientoDiag() {
        return tratamientoDiag;
    }

    public void setTratamientoDiag(Tratamiento tratamientoDiag) {
        this.tratamientoDiag = tratamientoDiag;
    }

    public Enfermedades getEnfermedadDiag() {
        return enfermedadDiag;
    }

    public void setEnfermedadDiag(Enfermedades enfermedadDiag) {
        this.enfermedadDiag = enfermedadDiag;
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
        hash += (codDiagnostico != null ? codDiagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnostico)) {
            return false;
        }
        Diagnostico other = (Diagnostico) object;
        if ((this.codDiagnostico == null && other.codDiagnostico != null) || (this.codDiagnostico != null && !this.codDiagnostico.equals(other.codDiagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Diagnostico[ codDiagnostico=" + codDiagnostico + " ]";
    }
    
}
