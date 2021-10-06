/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.logindto;

import com.arelance.proyectoimd.domain.dto.LoginDTO;
import javax.ejb.Local;

/**
 *
 * @author Miguel
 */
@Local
public interface DTOLogin_DAO {
    public LoginDTO login(LoginDTO loginDTO);
}
