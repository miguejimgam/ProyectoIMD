/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.usuario.impl;

import Beans.Usuario;
import com.arelance.proyectoimd.dao.usuario.UsuarioDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Miguel
 */
@Stateless
public class UsuarioDAOImpl implements UsuarioDAO{
    @PersistenceContext(unitName = "IDBConnection")
    EntityManager em;
    
    @Override
    public Usuario login(Usuario usuario) {
        return em.find(Usuario.class, usuario.getUser());
    }
    
}
