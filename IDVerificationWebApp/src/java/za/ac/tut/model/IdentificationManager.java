/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Philasande
 */
public class IdentificationManager implements IdentificationInterface{

    @Override
    public boolean validateID(String idNumber) {
        // Check if the input is null or not exactly 13 digits
        if (idNumber == null || idNumber.length() != 13) {
            return false;
        }
        
        // Check if all characters are digits
        if (!idNumber.matches("\\d{13}")) {
            return false;
        }
        
        int sum = 0;
        
        // Process each digit
        for (int i = 0; i < 13; i++) {
            int digit = Character.getNumericValue(idNumber.charAt(i));
            int position = i + 1; // Position starts from 1
            
            if (position % 2 == 0) { // Even position
                // Double the digit
                int doubled = digit * 2;
                
                // If doubled outcome is more than 9, perform modulo 9
                if (doubled > 9) {
                    doubled = doubled % 9;
                }
                
                sum += doubled;
            } else { // Odd position
                sum += digit;
            }
        }
        
        // Check if sum modulo 10 equals 0
        return sum % 10 == 0;
    }

    @Override
    public void updateIdentificationNo(String idNumber, HttpServletRequest request) {
        HttpSession session = request.getSession();
        
        String idNumbers = (String) session.getAttribute("idNumber");
        session.setAttribute("idNumbers", idNumbers);
    }
    
    
    
}
