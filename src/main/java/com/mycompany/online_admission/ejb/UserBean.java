package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.entity.Portfolio;
import com.mycompany.online_admission.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
public class UserBean {

    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());
    @PersistenceContext 
    private EntityManager em;

    public List<UserDetails> getAllUsers(){
        LOG.info("getAllUsers");
        try{
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
            UserDetails ud = new UserDetails(user.getId(), user.getUsername(), user.getEmail(), user.getPosition());
            detList.add(ud);
        }
        return detList;
    }
    public void createUser(String username,String email,String passwordSha256,String position){
        User user=new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordSha256);
        user.setPosition(position);
        em.persist(user);
    }
    

    private void EJBException(Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
