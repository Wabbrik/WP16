/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.ejb;

import com.mycompany.online_admission.common.PhotoDetails;
import com.mycompany.online_admission.entity.Photo;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Florin
 */
@Stateless
public class PhotoBean {

    private static final Logger LOG = Logger.getLogger(PhotoBean.class.getName());
    @PersistenceContext
    private EntityManager em;
    
    
    public PhotoDetails getPhotoByPhotoId(Integer photoId){
        LOG.info("getPhotoByPhotoId");
        TypedQuery<Photo>photoTQ=em.createQuery("SELECT p from Photo p where p.id=:id",Photo.class).setParameter("id",photoId);
        Photo photo=photoTQ.getSingleResult();
        return new PhotoDetails(photo.getId(), photo.getFilename(), photo.getFileType(), photo.getFileContent());
    }
}
