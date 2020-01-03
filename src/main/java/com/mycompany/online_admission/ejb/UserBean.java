/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Gabi
 */
@Stateless
public class UserBean {

    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());
    @PersistenceContext 
    private EntityManager em;

    public List<UserDetails> getAllUsers(){
        LOG.info("getAllUsers");
        try{
        // Query q = em.createQuery("SELECT u FROM User u");
        List<User> users = (List<User>) em.createQuery("SELECT u FROM User u").getResultList();
        return copyUsersToDetails(users);
        }
        catch(Exception ex){
            EJBException(ex);
        }
        return null;
    }
    
    private List<UserDetails> copyUsersToDetails( List<User> users){
        List<UserDetails> detList =new ArrayList<>();
        for(User user: users){
            UserDetails ud = new UserDetails(user.getId(), user.getUsername(), user.getEmail(), user.getPosition(), user.getPortfolio());
            detList.add(ud);
        }
        return detList;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    private void EJBException(Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
