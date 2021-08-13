/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utap.parcial.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import co.edu.utap.parcial.domain.PlanPago;
import java.util.ArrayList;

/**
 *
 * @author Maria Angelica
 */
@WebServlet(name = "ParcialController", urlPatterns = {"/ParcialController"})
public class ParcialController extends HttpServlet {

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
        
        int NroCuotas = Integer.valueOf(request.getParameter("txtPlazo"));
        double valorPrestamo = Double.valueOf(request.getParameter("txtValorPrestamo"));
        double tasa = Double.valueOf(request.getParameter("txtTasa"))/100;
        List<PlanPago> plan = new ArrayList<>();
        double cuotaMensual = valorPrestamo * ((tasa *(Math.pow((1+tasa),NroCuotas)))/((Math.pow((1+tasa),NroCuotas))- 1));
        
        double nuevoSaldo = valorPrestamo;
        double abonoCap = 0;
        double abonoInt = 0;
        for (int i = 0; i <= NroCuotas; i++) {
            PlanPago pago;
            
            if(i == 0){
                pago = new PlanPago(i, 0, 0, 0, valorPrestamo);
            }else{
           // calculando
           
           abonoInt = nuevoSaldo * tasa;
           abonoCap = cuotaMensual - abonoInt;
           nuevoSaldo = nuevoSaldo - abonoCap;
           
                    
                pago = new PlanPago(i, Math.round(abonoInt), Math.round(abonoCap), Math.round(cuotaMensual), Math.round(nuevoSaldo));
               
            }
            
            plan.add(pago);
        }
        
        request.setAttribute("plan", plan);
        request.getRequestDispatcher("Parcial.jsp").forward(request, response);
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
