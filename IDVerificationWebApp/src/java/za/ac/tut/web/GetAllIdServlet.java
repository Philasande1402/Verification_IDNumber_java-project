/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.IDVerificationFacadeLocal;
import za.ac.tut.entities.IDVerification;

/**
 *
 * @author Philasande
 */
public class GetAllIdServlet extends HttpServlet {

@EJB
    IDVerificationFacadeLocal ifl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<IDVerification> list = ifl.findAll();
        
        request.setAttribute("list", list);
        
        RequestDispatcher disp = request.getRequestDispatcher("get_all_id_numbers.jsp");
        disp.forward(request, response);
    }

   
}
