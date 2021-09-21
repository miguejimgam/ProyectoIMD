/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.services.usuarioservices;

import Beans.Usuario;
import javax.ejb.Local;

/**
 *
 * @author Miguel
 */
@Local
public interface UsuarioService {
    public Usuario login(Usuario usuario);
}
