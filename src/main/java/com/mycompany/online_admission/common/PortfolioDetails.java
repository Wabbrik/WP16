/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.common;

import com.mycompany.online_admission.entity.Photo;
import com.mycompany.online_admission.entity.User;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Gabi
 */
public class PortfolioDetails implements Serializable{
    private Integer id;
    private User user;
    private Collection<Photo>photos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Collection<Photo> photos) {
        this.photos = photos;
    }

    public PortfolioDetails(Integer id, User user, Collection<Photo> photos) {
        this.id = id;
        this.user = user;
        this.photos = photos;
    }
    
    
    
}
