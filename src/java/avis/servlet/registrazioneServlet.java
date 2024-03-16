/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avis.servlet;

import avis.utils.Utils;
import avis.exceptions.InvalidParamException;
import avis.model.Utente;
import avis.model.UtenteFactory;

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
import java.lang.Boolean;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

        

/**
 *
 * @author fpw
 */
@WebServlet(name = "registrazioneServlet", urlPatterns = {"/registrazioneServlet"})
public class registrazioneServlet extends HttpServlet { 

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
            throws ServletException, IOException, ParseException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String pass2 = request.getParameter("pass2");
        String nome = request.getParameter("nome");
        String cognome = request.getParameter("cognome");
        String data = request.getParameter("data");
        String codicefiscale = request.getParameter("codicefiscale");
        String sesso = request.getParameter("sesso");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        String gruppo = request.getParameter("gruppo");
        String patologie = request.getParameter("patologie");
        
        String message="Grazie per esserti registrato!";
        
         try{
            int min = 5;
            int max = 15;
  
        
            Utils.checkString(username, min, max);
            Utils.checkString(password, min, max);
            Utils.checkString(pass2, min, max);
            Utils.uguale(password, pass2);
            Utils.checkEmptyString(nome);
            Utils.checkEmptyString(cognome);
            Utils.checkDate(data);
            Utils.checkEmptyString(codicefiscale);
            Utils.checkCodiceFiscale(codicefiscale);
            Utils.checkEmptyString(sesso);
            Utils.checkEmptyString(email);
            Utils.checkEmail(email);
            Utils.checkEmptyString(telefono);
            Utils.checkTelefono(telefono);
            Utils.checkEmptyString(gruppo);
            
            if (( UtenteFactory.getInstance().registrazioneUtente(username, password, nome, cognome, 
                    data, codicefiscale, sesso, email, telefono, gruppo, patologie)) > 0){
               
                request.getRequestDispatcher("registrazioneEffettuata.jsp").forward(request, response);
            }else{
                throw new InvalidParamException("La registrazione non è andata a buon fine");
            }
            
            
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
        try{
                processRequest(request, response);   
            }catch (ParseException e){} catch (InvalidParamException e){};
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
        try{
                processRequest(request, response);   
            }catch (ParseException e){} catch (InvalidParamException e){};
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