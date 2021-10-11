/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.actividad;

import com.arelance.proyectoimd.domain.ActividadDeporte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Miguel
 */
@Local
public interface ActividadDAO {
    public List<ActividadDeporte> getAllActividades();
}
