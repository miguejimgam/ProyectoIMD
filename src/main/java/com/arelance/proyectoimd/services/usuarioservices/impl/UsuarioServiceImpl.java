/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.services.usuarioservices.impl;

import Beans.Usuario;
import com.arelance.proyectoimd.dao.usuario.UsuarioDAO;
import com.arelance.proyectoimd.services.usuarioservices.UsuarioService;
import javax.inject.Inject;

/**
 *
 * @author Miguel
 */
public class UsuarioServiceImpl implements UsuarioService{

    @Inject
    private UsuarioDAO usuarioDAO;
    
    @Override
    public Usuario login(Usuario usuario) {
        return usuarioDAO.login(usuario);
    }
    
}
