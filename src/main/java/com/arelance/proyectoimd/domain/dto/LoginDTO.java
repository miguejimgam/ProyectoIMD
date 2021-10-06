/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.domain.dto;

/**
 *
 * @author Miguel
 */
public class LoginDTO {
    private final String nickUsuario;
    private final String passwordUsuario;

    public LoginDTO(String nickUsuario, String passwordUsuario) {
        this.nickUsuario = nickUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public String getNickUsuario() {
        return nickUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}
