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
    private String validity;
    private String hasRegistrationForm;
    private String hasPhotos;

    public String getHasRegistrationForm() {
        return hasRegistrationForm;
    }

    public void setHasRegistrationForm(String hasRegistrationForm) {
        this.hasRegistrationForm = hasRegistrationForm;
    }

    public String getHasPhotos() {
        return hasPhotos;
    }

    public void setHasPhotos(String hasPhotos) {
        this.hasPhotos = hasPhotos;
    }
    

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

 
    
    
    
}
