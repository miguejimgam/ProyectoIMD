/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.actividad.impl;

import com.arelance.proyectoimd.dao.actividad.ActividadDAO;
import com.arelance.proyectoimd.domain.ActividadDeporte;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ActividadDAOImpl implements ActividadDAO {

    @PersistenceContext(unitName = "IDBConnection")
    EntityManager em;
    
    @Override
    public List<ActividadDeporte> getAllActividades() {
        return em.createNamedQuery("ActividadDeporte.findAll", ActividadDeporte.class).getResultList();
    }

    @Override
    public boolean addUsuarioToActividad(ActividadDeporte actividadDeporte) {
        try {
            em.merge(actividadDeporte);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    @Override
    public ActividadDeporte getActividadById(ActividadDeporte actividadDeporte) {
        return em.find(ActividadDeporte.class, actividadDeporte.getIdActvidad());
    }
    
}
