/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.services.logindtoservice.impl;

import com.arelance.proyectoimd.dao.logindto.DTOLogin_DAO;
import com.arelance.proyectoimd.domain.dto.LoginDTO;
import com.arelance.proyectoimd.services.logindtoservice.LoginService;
import javax.inject.Inject;


public class LoginServiceImpl implements LoginService {

    @Inject
    DTOLogin_DAO dtoLogin;
    
    @Override
    public LoginDTO login(LoginDTO loginDTO) {
        return dtoLogin.login(loginDTO);
    }
    
}
