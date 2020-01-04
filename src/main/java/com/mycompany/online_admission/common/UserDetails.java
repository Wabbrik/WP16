/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.online_admission.common;

import com.mycompany.online_admission.entity.Portfolio;
import java.io.Serializable;

/**
 *
 * @author Gabi
 */
public class UserDetails implements Serializable {

    private Integer id;
    private String username;
    private String email;
    private String position;
    private String valid;

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public UserDetails(Integer id, String username, String email, String position,String valid) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.position = position;
        this.valid=valid;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
