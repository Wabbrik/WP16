package com.mycompany.online_admission.servlet.user;


import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.ejb.UserBean;
import com.mycompany.online_admission.util.PasswordUtil;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@ServletSecurity(value = @HttpConstraint(rolesAllowed = {"AdminRole"}))
@WebServlet(name = "AddUser", urlPatterns = {"/Users/Create"})
public class AddUser extends HttpServlet {
    @Inject
    UserBean userBean;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/user/addUser.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String position=request.getParameter("position");
        String passwordSha256=PasswordUtil.convertToSha256(password);
        
        List<UserDetails>users=userBean.getAllUsers();
        boolean create=true;
        for(UserDetails user:users){
            if((user.getUsername().equals(username))||user.getEmail().equals(email)){
                create=false;
            }
        }
        if(create==true){
            userBean.createUser(username, email, passwordSha256, position);
            request.setAttribute("message1", "L-ai inregistrat cu succes pe ");
            request.setAttribute("message2", username);
        }else{
            request.setAttribute("message1", "Username sau email deja in uz!");
        }
        //response.sendRedirect(request.getContextPath()+"/Users");
        request.getRequestDispatcher(request.getContextPath()+ "/Users").forward(request,response);
        //request.getRequestDispatcher("/WEB-INF/pages/user/users.jsp").forward(request, response);
       
        
        
        
    }

    @Override
    public String getServletInfo(){
        return "AddUser v1.0";
    }
}
