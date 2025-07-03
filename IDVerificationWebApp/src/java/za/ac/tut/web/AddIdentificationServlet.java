/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.ejb.bl.IDVerificationFacadeLocal;
import za.ac.tut.entities.IDVerification;

/**
 *
 * @author Philasande
 */
public class AddIdentificationServlet extends HttpServlet {
@EJB
    IDVerificationFacadeLocal ifl;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String name = (String) session.getAttribute("name");
        Long id = (Long) session.getAttribute("id");
        String idNumber = (String) session.getAttribute("idNumber");
        
        IDVerification adi = createID(name,id,idNumber);
        ifl.create(adi);
        
        session.setAttribute("name", name);
        RequestDispatcher disp = request.getRequestDispatcher("add_identification_outcome.jsp");
        disp.forward(request, response);
    }

    private IDVerification createID(String name, Long id, String idNumber) {
        IDVerification i = new IDVerification();
        
        i.setId(id);
        i.setName(name);
        i.setIdNumber(idNumber);
        i.setCreationDate(new Date());
        
        return i;
    }

   
}
