/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cabjr_000
 */
@Entity
@Table(catalog = "", schema = "ADMTELE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r"),
    @NamedQuery(name = "Registro.findByLogin", query = "SELECT r FROM Registro r WHERE r.login = :login"),
    @NamedQuery(name = "Registro.findByCorreoUsuario", query = "SELECT r FROM Registro r WHERE r.correoUsuario = :correoUsuario"),
    @NamedQuery(name = "Registro.findByContrasena", query = "SELECT r FROM Registro r WHERE r.contrasena = :contrasena"),
    @NamedQuery(name = "Registro.findByIdUsuario", query = "SELECT r FROM Registro r WHERE r.idUsuario = :idUsuario")})
public class Registro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 10)
    @Column(length = 10)
    private String login;
    @Size(max = 20)
    @Column(name = "CORREO_USUARIO", length = 20)
    private String correoUsuario;
    @Size(max = 20)
    @Column(length = 20)
    private String contrasena;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_USUARIO", nullable = false, length = 20)
    private String idUsuario;

    public Registro() {
    }

    public Registro(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityes.Registro[ idUsuario=" + idUsuario + " ]";
    }
    
}
