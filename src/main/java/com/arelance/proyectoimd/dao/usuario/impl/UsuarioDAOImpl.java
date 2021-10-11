/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.usuario.impl;

import com.arelance.proyectoimd.domain.Usuario;
import com.arelance.proyectoimd.dao.usuario.UsuarioDAO;
import com.arelance.proyectoimd.domain.ActividadDeporte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Miguel
 */
@Stateless
public class UsuarioDAOImpl implements UsuarioDAO {

    @PersistenceContext(unitName = "IDBConnection")
    EntityManager em;

    @Override
    public void registerUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void testMany(ActividadDeporte actividaddeporte) {
        em.merge(actividaddeporte);
    }

    @Override
    public Usuario findUsuarioByNick(Usuario usuario) {
        Query usuarioQuery = em.createNamedQuery("Usuario.findByNickUsuario", Usuario.class);
        usuarioQuery.setParameter("nickUsuario", usuario.getNickUsuario());
        try {
            return (Usuario) usuarioQuery.getSingleResult();
        } catch (NoResultException ex){
            return null;
        }
    }
}
