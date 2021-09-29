/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.usuario.impl;

import com.arelance.proyectoimd.domain.Usuario;
import com.arelance.proyectoimd.dao.usuario.UsuarioDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
        Query usuarioQuery = em.createNamedQuery("Usuario.findByNickUsuario", Usuario.class);
        usuarioQuery.setParameter("nickUsuario", usuario.getNickUsuario());
        List<Usuario> lista = usuarioQuery.getResultList();
        if (lista.size() == 0) {
            return null;
        } 
        return lista.get(0);
   }

    @Override
    public void registerUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdusuario());
    }
    
}
