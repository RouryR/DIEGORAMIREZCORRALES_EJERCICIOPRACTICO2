/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DIEGORAMIREZCORRALES_EJERCICIOPRACTICO2.Diego.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * @author ROURY
 */
@Entity
//MAPEA LA TABLA CLIENTE PARA INTERACTUAR CON SUS DATOS
@Table(name = "Cliente")
public class Usuario {
     @Id
    private int id_Cliente;    
    private String nombre;    
    private String apellido;
    private String correo;
    private String telefono;
    private String nombre_usuario;
    private String contrasena;    
    private Long id_rol;
    private Boolean activo;

public Usuario() {
    }

    public Usuario(int id_Cliente, String nombre, String apellido, String correo, String telefono, String nombre_usuario, String contrasena, Long id_rol, Boolean activo) {
        this.id_Cliente = id_Cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.id_rol = id_rol;
        this.activo = activo;
    }
    
    public int getId() {
        return id_Cliente;
    }

    public void setId(int id) {
        this.id_Cliente = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}