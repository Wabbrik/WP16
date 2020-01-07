package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.PhotoDetails;
import com.mycompany.online_admission.common.PortfolioDetails;
import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.entity.Photo;
import com.mycompany.online_admission.entity.Portfolio;
import com.mycompany.online_admission.entity.RegistrationForm;
import com.mycompany.online_admission.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.TypedQuery;

@Stateless
public class UserBean {

    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());
    @PersistenceContext
    private EntityManager em;

    @Resource
    private SessionContext context;

    public SessionContext getContext() {
        return context;
    }

    public List<UserDetails> getAllUsers() {
        LOG.info("getAllUsers");

        try {
            List<User> users = (List<User>) em.createQuery("SELECT u FROM User u").getResultList();
            return copyUsersToDetails(users);
        } catch (Exception ex) {

            EJBException(ex);
        }
        return null;
    }

    private List<UserDetails> copyUsersToDetails(List<User> users) {
        List<UserDetails> detList = new ArrayList<>();
        for (User user : users) {
            UserDetails ud = new UserDetails(user.getId(), user.getUsername(), user.getEmail(), user.getPosition(), user.getHasPortfolio());

            detList.add(ud);
        }
        return detList;
    }

    public void createUser(String username, String email, String passwordSha256, String position, String hasPortfolio) {
        LOG.info("createUser");
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordSha256);
        user.setPosition(position);
        user.setHasPortfolio("NO");
        em.persist(user);
    }

    public int getIdByUsername(String username) {
        LOG.info("getIdByUsername");
        TypedQuery<User> tQ = em.createQuery("select p from User p where p.username= :name", User.class).setParameter("name", username);
        User user = tQ.getSingleResult();
        return user.getId();
    }

    public UserDetails getUserById(Integer id) {
        LOG.info("getUserById");
        TypedQuery<User> tq = em.createQuery("SELECT u from User u where u.id=:userId", User.class).setParameter("userId", id);
        User user = tq.getSingleResult();
        if (user == null) {
            return null;
        }
        UserDetails userd = new UserDetails(user.getId(), user.getUsername(), user.getEmail(), user.getPosition(), user.getHasPortfolio());
        return userd;
    }

    public boolean hasUserPortfolio(Integer userId) {
        LOG.info("hasUserPortfolio");
        UserDetails user = getUserById(userId);
        if (user.getHasPortfolio().equals("NO")) {
            return false;
        }
        return true;
    }

    public void deleteUsersByIds(List<Integer> userIds) {
        LOG.info("deleteUsersByIds");
        for (Integer id : userIds) {
            User user = em.find(User.class, id);
            em.remove(user);
        }
    }

    private void EJBException(Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
