/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.listeners;

import com.arelance.proyectoimd.services.actividadservice.ActividadService;
import javax.inject.Inject;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Web application lifecycle listener.
 *
 * @author Miguel
 */
public class ListaCursosLoginListener implements HttpSessionListener {
    
    @Inject
    private ActividadService actividadService;
    
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("listaActividades", actividadService.getAllActividades());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
