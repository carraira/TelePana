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
import javax.persistence.Lob;
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
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByTipoId", query = "SELECT u FROM Usuario u WHERE u.tipoId = :tipoId"),
    @NamedQuery(name = "Usuario.findByLogin", query = "SELECT u FROM Usuario u WHERE u.login = :login"),
    @NamedQuery(name = "Usuario.findByEstadoCUsuario", query = "SELECT u FROM Usuario u WHERE u.estadoCUsuario = :estadoCUsuario"),
    @NamedQuery(name = "Usuario.findByTipoUsuario", query = "SELECT u FROM Usuario u WHERE u.tipoUsuario = :tipoUsuario"),
    @NamedQuery(name = "Usuario.findByContrasena", query = "SELECT u FROM Usuario u WHERE u.contrasena = :contrasena"),
    @NamedQuery(name = "Usuario.findByFechaNacimiento", query = "SELECT u FROM Usuario u WHERE u.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Usuario.findByEdad", query = "SELECT u FROM Usuario u WHERE u.edad = :edad"),
    @NamedQuery(name = "Usuario.findBySexoUsuario", query = "SELECT u FROM Usuario u WHERE u.sexoUsuario = :sexoUsuario"),
    @NamedQuery(name = "Usuario.findByCorreoUsuario", query = "SELECT u FROM Usuario u WHERE u.correoUsuario = :correoUsuario"),
    @NamedQuery(name = "Usuario.findByDireccionUsuario", query = "SELECT u FROM Usuario u WHERE u.direccionUsuario = :direccionUsuario"),
    @NamedQuery(name = "Usuario.findByIdSkype", query = "SELECT u FROM Usuario u WHERE u.idSkype = :idSkype"),
    @NamedQuery(name = "Usuario.findByTelefonoUsuario", query = "SELECT u FROM Usuario u WHERE u.telefonoUsuario = :telefonoUsuario"),
    @NamedQuery(name = "Usuario.findByApellidoPUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidoPUsuario = :apellidoPUsuario"),
    @NamedQuery(name = "Usuario.findByApellidoMUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidoMUsuario = :apellidoMUsuario"),
    @NamedQuery(name = "Usuario.findByPNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.pNombreUsuario = :pNombreUsuario"),
    @NamedQuery(name = "Usuario.findBySNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.sNombreUsuario = :sNombreUsuario"),
    @NamedQuery(name = "Usuario.findByDescripcionUsuario", query = "SELECT u FROM Usuario u WHERE u.descripcionUsuario = :descripcionUsuario")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USUARIO", nullable = false)
    private Long idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TIPO_ID", nullable = false, length = 3)
    private String tipoId;
    @Size(max = 20)
    @Column(length = 20)
    private String login;
    @Size(max = 10)
    @Column(name = "ESTADO_C_USUARIO", length = 10)
    private String estadoCUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TIPO_USUARIO", nullable = false, length = 10)
    private String tipoUsuario;
    @Lob
    @Column(name = "FOTO_USUARIO")
    private Serializable fotoUsuario;
    @Size(max = 10)
    @Column(length = 10)
    private String contrasena;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short edad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEXO_USUARIO", nullable = false)
    private char sexoUsuario;
    @Size(max = 30)
    @Column(name = "CORREO_USUARIO", length = 30)
    private String correoUsuario;
    @Size(max = 60)
    @Column(name = "DIRECCION_USUARIO", length = 60)
    private String direccionUsuario;
    @Size(max = 20)
    @Column(name = "ID_SKYPE", length = 20)
    private String idSkype;
    @Column(name = "TELEFONO_USUARIO")
    private Long telefonoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "APELLIDO_P_USUARIO", nullable = false, length = 60)
    private String apellidoPUsuario;
    @Size(max = 60)
    @Column(name = "APELLIDO_M_USUARIO", length = 60)
    private String apellidoMUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "P_NOMBRE_USUARIO", nullable = false, length = 60)
    private String pNombreUsuario;
    @Size(max = 60)
    @Column(name = "S_NOMBRE_USUARIO", length = 60)
    private String sNombreUsuario;
    @Size(max = 200)
    @Column(name = "DESCRIPCION_USUARIO", length = 200)
    private String descripcionUsuario;
    @JoinColumn(name = "COD_POSTAL", referencedColumnName = "COD_POSTAL")
    @ManyToOne
    private Ciudad codPostal;

    public Usuario() {
    }

    public Usuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Long idUsuario, String tipoId, String tipoUsuario, Date fechaNacimiento, short edad, char sexoUsuario, String apellidoPUsuario, String pNombreUsuario) {
        this.idUsuario = idUsuario;
        this.tipoId = tipoId;
        this.tipoUsuario = tipoUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.sexoUsuario = sexoUsuario;
        this.apellidoPUsuario = apellidoPUsuario;
        this.pNombreUsuario = pNombreUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEstadoCUsuario() {
        return estadoCUsuario;
    }

    public void setEstadoCUsuario(String estadoCUsuario) {
        this.estadoCUsuario = estadoCUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Serializable getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(Serializable fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public char getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(char sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getIdSkype() {
        return idSkype;
    }

    public void setIdSkype(String idSkype) {
        this.idSkype = idSkype;
    }

    public Long getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(Long telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getApellidoPUsuario() {
        return apellidoPUsuario;
    }

    public void setApellidoPUsuario(String apellidoPUsuario) {
        this.apellidoPUsuario = apellidoPUsuario;
    }

    public String getApellidoMUsuario() {
        return apellidoMUsuario;
    }

    public void setApellidoMUsuario(String apellidoMUsuario) {
        this.apellidoMUsuario = apellidoMUsuario;
    }

    public String getPNombreUsuario() {
        return pNombreUsuario;
    }

    public void setPNombreUsuario(String pNombreUsuario) {
        this.pNombreUsuario = pNombreUsuario;
    }

    public String getSNombreUsuario() {
        return sNombreUsuario;
    }

    public void setSNombreUsuario(String sNombreUsuario) {
        this.sNombreUsuario = sNombreUsuario;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    public Ciudad getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Ciudad codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
