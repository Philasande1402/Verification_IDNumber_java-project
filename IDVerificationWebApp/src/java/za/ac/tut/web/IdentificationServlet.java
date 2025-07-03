/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.IdentificationInterface;
import za.ac.tut.model.IdentificationManager;

/**
 *
 * @author Philasande
 */
public class IdentificationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String idNumber = request.getParameter("idNo");
        IdentificationInterface idNo = new IdentificationManager();
        if(idNo.validateID(idNumber)){
            
            idNo.updateIdentificationNo(idNumber, request);
            HttpSession session = request.getSession();
            session.setAttribute("idNumber", idNumber);
            
            RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
            disp.forward(request, response);
            
        }else{
            response.sendRedirect("error_mess.jsp");
        }
    }


}
