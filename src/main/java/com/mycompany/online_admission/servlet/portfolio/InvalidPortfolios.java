package com.mycompany.online_admission.servlet.portfolio;

import com.mycompany.online_admission.common.RegistrationFormDetails;
import com.mycompany.online_admission.ejb.PortfolioBean;
import com.mycompany.online_admission.ejb.RegistrationFormBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ServletSecurity(value = @HttpConstraint(rolesAllowed = { "AdminRole", "SecretaryRole"})) //2
@WebServlet(name = "InvalidPortfolios", urlPatterns = {"/InvalidPortfolios"})
public class InvalidPortfolios extends HttpServlet {

    @Inject
    RegistrationFormBean registrationFormBean;
    @Inject
    PortfolioBean portfolioBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Set<Integer> validPortfolioIds = portfolioBean.getValidPortfolioIdsList();
        List<RegistrationFormDetails> rfd = registrationFormBean.getAllRegistrationFormsThatBelongToAnInvalidPortfolioByValidPortfolioIdsList(validPortfolioIds);
        request.setAttribute("registrationForms", rfd);
        request.setAttribute("ascundeValidate", "nu");
        request.getRequestDispatcher("/WEB-INF/pages/portfoliosPreview.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
