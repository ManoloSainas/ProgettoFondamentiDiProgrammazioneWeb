/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avis.servlet;

import avis.utils.Utils;
import avis.exceptions.InvalidParamException;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author fpw
 */
@WebServlet(name = "paginaPersonaleServlet", urlPatterns = {"/paginaPersonaleServlet"})
public class paginaPersonaleServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession(false);
        
        if(session != null && session.getAttribute("user") != null){
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String pass2 = request.getParameter("pass2");
            String nome = request.getParameter("nome");
            String cognome = request.getParameter("cognome");
            LocalDate data = LocalDate.parse(request.getParameter("data"));
            String codicefiscale = request.getParameter("codicefiscale");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            String gruppo = request.getParameter("gruppo");
            String patologie = request.getParameter("patologie");
            
            String message="I tuoi dati sono stati modificati!";
            
            try{
                int min = 5;
                int max = 15;
  
        
                Utils.checkString(username, min, max);
                Utils.checkString(password, min, max);
                Utils.checkString(pass2, min, max);
                Utils.uguale(password, pass2);
                Utils.checkEmptyString(nome);
                Utils.checkEmptyString(cognome);           
                Utils.checkEmptyString(codicefiscale);
                Utils.checkCodiceFiscale(codicefiscale);
                Utils.checkEmptyString(email);
                Utils.checkEmail(email);
                Utils.checkEmptyString(telefono);
                Utils.checkTelefono(telefono);
                Utils.checkEmptyString(gruppo);
            
            
                request.getRequestDispatcher("paginaPersonale.jsp").forward(request, response);
        
            
            } catch(InvalidParamException e){
                request.setAttribute("errorMessage", e.getMessage());
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ProvaServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>" + message + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
            
            
            } else{
                response.sendRedirect("login.jsp");
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