/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.IDVerification;

/**
 *
 * @author Philasande
 */
@Local
public interface IDVerificationFacadeLocal {

    void create(IDVerification iDVerification);

    void edit(IDVerification iDVerification);

    void remove(IDVerification iDVerification);

    IDVerification find(Object id);

    List<IDVerification> findAll();

    List<IDVerification> findRange(int[] range);

    int count();
    
}
