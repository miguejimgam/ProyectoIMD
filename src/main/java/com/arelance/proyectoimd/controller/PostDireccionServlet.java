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
import java.io.PrintWriter;
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
        
        String calle_direccion = request.getParameter("calle_direccion");
        String numero_direccion = request.getParameter("numero_direccion");
        String bloque_direccion = request.getParameter("bloque_direccion");
        String portal_direccion = request.getParameter("portal_direccion");
        String piso_direccion = request.getParameter("piso_direccion");
        String puerta_direccion = request.getParameter("puerta_direccion");
        String localidad_direccion = request.getParameter("localidad_direccion");
        String cp_direccion = request.getParameter("cp_direccion");
        String provincia_direccion = request.getParameter("provincia_direccion");
        
        Direccion direccionRegistro = new Direccion();
        direccionRegistro.setCalleDireccion(calle_direccion);
        direccionRegistro.setNumeroDireccion(numero_direccion);
        direccionRegistro.setBloqueDireccion(bloque_direccion);
        direccionRegistro.setPortalDireccion(portal_direccion);
        direccionRegistro.setPisoDireccion(piso_direccion);
        direccionRegistro.setPuertaDireccion(puerta_direccion);
        direccionRegistro.setLocalidadDireccion(localidad_direccion);
        direccionRegistro.setCpDireccion(cp_direccion);
        direccionRegistro.setProvinciaDireccion(provincia_direccion);
        
        loggedUser.setDireccion(direccionRegistro);
        usuarioService.registerUsuario(loggedUser);
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
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
