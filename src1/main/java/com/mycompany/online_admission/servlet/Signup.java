package com.mycompany.online_admission.servlet;

import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.ejb.UserBean;
import com.mycompany.online_admission.util.PasswordUtil;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {

    @Inject
    private UserBean userBean;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/signup.jsp").forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String position="CLIENT";
        String passwordSha256=PasswordUtil.convertToSha256(password);
        
        List<UserDetails>users=userBean.getAllUsers();
        boolean create=true;
        for(UserDetails user:users){
            if((user.getUsername().equals(username))||user.getEmail().equals(email)){
                create=false;
            }
        }
        if(create==true){
            userBean.createUser(username, email, passwordSha256, position,"NU");
            request.setAttribute("message", "Te-ai inregistrat cu succes! In 5 secunde vei fi redirectionat spre pagina de Login...");
            request.setAttribute("message2", "login");
        }else{
            request.setAttribute("message", "Username sau email deja in uz!");
        }
        request.getRequestDispatcher("/WEB-INF/pages/signup.jsp").forward(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Signup v1.0";
    }

}
