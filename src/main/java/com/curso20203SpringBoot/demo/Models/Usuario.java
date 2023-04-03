/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso20203SpringBoot.demo.Models;

/**
 *
 * @author ayosu
 */
public class Usuario {
    private String nombre_completo;
    private String  Usuario;
    private String Email;
    public  Usuario (){
        
    } 

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public Usuario(String nombre_completo, String Usuario, String Email) {
        this.nombre_completo = nombre_completo;
        this.Usuario = Usuario;
        this.Email=Email;
    }
    
    
    
}
