/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.proyectoimd.controller;

import com.arelance.proyectoimd.domain.Direccion;
import com.arelance.proyectoimd.domain.Usuario;
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
@WebServlet(name = "PostDireccionServlet", urlPatterns = {"/PostDireccionServlet"})
public class PostDireccionServlet extends HttpServlet {
        
        @Inject
        UsuarioService usuarioService;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        Usuario loggedUser = (Usuario) request.getSession().getAttribute("loggedUser");    
        Direccion direccionRegistro = (loggedUser.getDireccion()== null) ? new Direccion() : loggedUser.getDireccion();
        // <editor-fold defaultstate="collapsed" desc="Direccion setters. Click on the + sign on the left to edit the code.">
        direccionRegistro.setCalleDireccion(request.getParameter("calle_direccion"));
        direccionRegistro.setNumeroDireccion(request.getParameter("numero_direccion"));
        direccionRegistro.setBloqueDireccion(request.getParameter("bloque_direccion"));
        direccionRegistro.setPortalDireccion(request.getParameter("portal_direccion"));
        direccionRegistro.setPisoDireccion(request.getParameter("piso_direccion"));
        direccionRegistro.setPuertaDireccion(request.getParameter("puerta_direccion"));
        direccionRegistro.setLocalidadDireccion(request.getParameter("localidad_direccion"));
        direccionRegistro.setCpDireccion(request.getParameter("cp_direccion"));
        direccionRegistro.setProvinciaDireccion(request.getParameter("provincia_direccion"));// </editor-fold>
        
        loggedUser.setDireccion(direccionRegistro);
        usuarioService.updateUsuario(loggedUser);
        getServletContext().getRequestDispatcher("/MainServlet").forward(request, response);
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
