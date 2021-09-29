/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.dao.usuario;

import com.arelance.proyectoimd.domain.Usuario;
import javax.ejb.Local;

/**
 *
 * @author Miguel
 */
@Local
public interface UsuarioDAO {
    public Usuario login(Usuario usuario);
    public void registerUsuario(Usuario usuario);
    public Usuario findUsuarioById(Usuario usuario);
}
