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
    private String hasPortfolio;

    public UserDetails(Integer id, String username, String email, String position,String hasPortfolio) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.position = position;
        this.hasPortfolio=hasPortfolio;
    }

    public void setHasPortfolio(String hasPortfolio) {
        this.hasPortfolio = hasPortfolio;
    }

    public String getHasPortfolio() {
        return hasPortfolio;
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
