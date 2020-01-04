package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.PhotoDetails;
import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.entity.Photo;
import com.mycompany.online_admission.entity.Portfolio;
import com.mycompany.online_admission.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class UserBean {

    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());
    @PersistenceContext
    private EntityManager em;

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
            UserDetails ud = new UserDetails(user.getId(), user.getUsername(), user.getEmail(), user.getPosition(),user.getValid());
            detList.add(ud);
        }
        return detList;
    }

    public void createUser(String username, String email, String passwordSha256, String position) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(passwordSha256);
        user.setPosition(position);
        user.setValid("NEVALID");
        em.persist(user);
    }

    public List<PhotoDetails> findPhotosByUserId(Integer userId) {
        TypedQuery<Photo> tQ = em.createQuery("SELECT p FROM Photo p where p.portfolio.id = :id", Photo.class).setParameter("id", userId);
        List<Photo> photos = tQ.getResultList();
        if (photos.isEmpty()) {
            return null;
        }
        List<PhotoDetails>photoDetails=new ArrayList<>();
        for(Photo photo:photos){
            photoDetails.add(new PhotoDetails(photo.getId(), photo.getFilename(), photo.getFileType(), photo.getFileContent())); 
        }
        return photoDetails ;
    }

    public void addPhotoToPortfolio(Integer userId, String fileName, String fileType, byte[] fileContent) {
        LOG.info("addPhotoToPortfolio");
        Photo photo = new Photo();
        photo.setFilename(fileName);
        photo.setFileType(fileType);
        photo.setFileContent(fileContent);

        Portfolio p = em.find(Portfolio.class, userId);
        p.getPhotos().add(photo);

        photo.setPortfolio(p);
        em.persist(photo);
    }

    private void EJBException(Exception ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
