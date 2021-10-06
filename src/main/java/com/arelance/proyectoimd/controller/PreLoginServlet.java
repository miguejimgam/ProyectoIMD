/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.controller;

import com.arelance.proyectoimd.domain.Usuario;
import com.arelance.proyectoimd.domain.dto.LoginDTO;
import com.arelance.proyectoimd.dto.login.LoginService;
import com.arelance.proyectoimd.services.usuarioservices.UsuarioService;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
@WebServlet(name = "PreLoginServlet", urlPatterns = {"/PreLoginServlet"})
public class PreLoginServlet extends HttpServlet {

    @Inject
    LoginService loginService;
    @Inject
    UsuarioService usuarioService;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        LoginDTO login = new LoginDTO(usuario, password);
        LoginDTO loginTry = loginService.login(login);
        if (loginTry == null) {
            request.setAttribute("badLogin", true);
            getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            Usuario loggedUser = new Usuario();
            loggedUser.setNickUsuario(usuario);
            loggedUser.setPasswordUsuario(password);
            
            request.getSession().setAttribute("loggedUser", usuarioService.findUsuarioByNick(loggedUser));
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
