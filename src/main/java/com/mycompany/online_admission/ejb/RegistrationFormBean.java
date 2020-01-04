/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.ejb;

import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Florin
 */
@Stateless
public class RegistrationFormBean {

    private static final Logger LOG = Logger.getLogger(RegistrationFormBean.class.getName());
    @PersistenceContext 
    private EntityManager em;
    
    //addRegistrationFormToUser()
    //getRegistrationFormById()
}
