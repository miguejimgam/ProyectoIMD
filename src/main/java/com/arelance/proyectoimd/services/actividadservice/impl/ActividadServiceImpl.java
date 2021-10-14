/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.services.actividadservice.impl;

import com.arelance.proyectoimd.dao.actividad.ActividadDAO;
import com.arelance.proyectoimd.domain.ActividadDeporte;
import com.arelance.proyectoimd.services.actividadservice.ActividadService;
import java.util.List;
import javax.inject.Inject;


public class ActividadServiceImpl implements ActividadService {

    @Inject
    private ActividadDAO actividadDAO;
    
    @Override
    public List<ActividadDeporte> getAllActividades() {
        return actividadDAO.getAllActividades();
    }

    @Override
    public boolean addUsuarioToActividad(ActividadDeporte actividadDeporte) {
        return actividadDAO.addUsuarioToActividad(actividadDeporte);
    }

    @Override
    public ActividadDeporte getActividadById(ActividadDeporte actividadDeporte) {
        return actividadDAO.getActividadById(actividadDeporte);
    }
    
}
