/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entityes;


import java.util.Date;
import javax.persistence.Temporal;


/**
 *
 * @author cabjr_000
 */

public class Usuario {
 
    private Long idUsuario;
    
    private String tipoId;
    
    private String login;
    
    private String estadoCUsuario;
    
    private String tipoUsuario;
    
    private String contrasena;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaNacimiento;
    
    private short edad;
    
    private char sexoUsuario;
   
    private String correoUsuario;
    private String direccionUsuario;
    private Long telefonoUsuario;
    private String apellidoPUsuario;
   
    private String apellidoMUsuario;
    
    private String pNombreUsuario;
    
    private String sNombreUsuario;
    
    private String descripcionUsuario;
   
 

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

    

  
 
    
}
