/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dto.login;
import com.arelance.proyectoimd.domain.dto.LoginDTO;
/**
 *
 * @author Miguel
 */
public interface LoginService {
    public LoginDTO login(LoginDTO loginDTO);
}
