/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author anticuchito
 */
public class Usuario {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String direccionUsuario;
    private String ComunaUsuario;
    private String ciudadUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, String direccionUsuario, String ComunaUsuario, String ciudadUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.ComunaUsuario = ComunaUsuario;
        this.ciudadUsuario = ciudadUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getComunaUsuario() {
        return ComunaUsuario;
    }

    public void setComunaUsuario(String ComunaUsuario) {
        this.ComunaUsuario = ComunaUsuario;
    }

    public String getCiudadUsuario() {
        return ciudadUsuario;
    }

    public void setCiudadUsuario(String ciudadUsuario) {
        this.ciudadUsuario = ciudadUsuario;
    }
    
    
}
