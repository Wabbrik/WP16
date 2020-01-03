package com.mycompany.online_admission.servlet.user;

import com.mycompany.online_admission.common.UserDetails;
import com.mycompany.online_admission.ejb.UserBean;
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
@WebServlet(name = "Users", urlPatterns = {"/Users"})
public class Users extends HttpServlet {

   @Inject
   UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("activePage","Users");
        List<UserDetails>users=userBean.getAllUsers();
        request.setAttribute("users",users);
        request.getRequestDispatcher("/WEB-INF/pages/user/users.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   
    @Override
    public String getServletInfo() {
        return "Users v1.0";
    }

}
