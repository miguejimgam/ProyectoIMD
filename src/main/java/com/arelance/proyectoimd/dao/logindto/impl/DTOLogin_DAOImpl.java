/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.logindto.impl;

import com.arelance.proyectoimd.dao.logindto.DTOLogin_DAO;
import com.arelance.proyectoimd.domain.dto.LoginDTO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class DTOLogin_DAOImpl implements DTOLogin_DAO {

    @PersistenceContext(name = "IDBConnection")
    EntityManager em;
    
    @Override
    public LoginDTO login(LoginDTO loginDTO) {
        Query query = em.createQuery("SELECT DISTINCT new com.arelance.proyectoimd.domain.dto.LoginDTO "
                + "(u.nickUsuario, u.passwordUsuario) FROM Usuario u WHERE u.nickUsuario = :nickUsuario");
        query.setParameter("nickUsuario", loginDTO.getNickUsuario());
        try {
            return (LoginDTO) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        }
    }
    
}
