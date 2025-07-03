/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.IDVerificationFacadeLocal;

/**
 *
 * @author Philasande
 */
public class GetTotalIdServlet extends HttpServlet {
@EJB
    IDVerificationFacadeLocal ifl;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer size = ifl.count();
        
        request.setAttribute("size", size);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_total_outcome.jsp");
        disp.forward(request, response);
    }

    
}
