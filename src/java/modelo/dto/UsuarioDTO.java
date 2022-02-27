/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Darwin Melo Perez
 */
public class UsuarioDTO extends HttpServlet {

    private int id;
    private String nombre1;
    private String nombre2;
    private String apellodo1;
    private String apellido2;
    private String n_identificacion;
    private String correo;
    private String clave;
    private char sexo;
    private Date fecha_nac;
    private boolean estado;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int id, String nombre1, String nombre2, String apellodo1, String apellido2, String n_identificacion, String correo) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellodo1 = apellodo1;
        this.apellido2 = apellido2;
        this.n_identificacion = n_identificacion;
        this.correo = correo;
    }
    
    
    public UsuarioDTO(String nombre1, String nombre2, String apellodo1, String apellido2, String n_identificacion, String correo, String clave, char sexo, Date fecha_nac, boolean estado) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellodo1 = apellodo1;
        this.apellido2 = apellido2;
        this.n_identificacion = n_identificacion;
        this.correo = correo;
        this.clave = clave;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
        this.estado = estado;
    }

    public UsuarioDTO(int id, String nombre1, String nombre2, String apellodo1, String apellido2, String n_identificacion, String correo, String clave, char sexo, Date fecha_nac, boolean estado) {
        this.id = id;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellodo1 = apellodo1;
        this.apellido2 = apellido2;
        this.n_identificacion = n_identificacion;
        this.correo = correo;
        this.clave = clave;
        this.sexo = sexo;
        this.fecha_nac = fecha_nac;
        this.estado = estado;
    }

    public UsuarioDTO(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellodo1() {
        return apellodo1;
    }

    public void setApellodo1(String apellodo1) {
        this.apellodo1 = apellodo1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getN_identificacion() {
        return n_identificacion;
    }

    public void setN_identificacion(String n_identificacion) {
        this.n_identificacion = n_identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre1 + " " + nombre2 + " " + apellodo1 + " " + apellido2 ;
    }

    

}
