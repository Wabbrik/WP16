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

@ServletSecurity(value = @HttpConstraint(rolesAllowed = {"SecretaryRole"}))
@WebServlet(name = "ValidatePortfolio", urlPatterns = {"/Portfolios/Validate"})
public class ValidatePortfolio extends HttpServlet {

    @Inject
    RegistrationFormBean registrationFormBean;
    @Inject
    PortfolioBean portfolioBean;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer rfdId = Integer.parseInt(request.getParameter("id"));
        RegistrationFormDetails rfd = registrationFormBean.getRegistrationFormByRegistrationFormId(rfdId);
        List<Integer> photoIds = registrationFormBean.getPhotoIdsByRegistrationFormId(rfdId);
        request.setAttribute("idPozaBac", photoIds.get(0));
        request.setAttribute("idPozaCertificatNastere", photoIds.get(1));
        request.setAttribute("idPozaAdeverintaMedicala", photoIds.get(2));
        request.setAttribute("idPozaProfil", photoIds.get(3));
        request.setAttribute("idPozaCarteIdentitate", photoIds.get(4));
        request.setAttribute("idPozaChitantaPlata", photoIds.get(5));
        request.setAttribute("rf", rfd);
        request.setAttribute("ascundeValidate", request.getParameter("ascunde"));
        request.getRequestDispatcher("/WEB-INF/pages/portfoliosFull.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer portfolioId = registrationFormBean.getPortfolioIdByRegistrationFormId(Integer.parseInt(request.getParameter("rfId")));
        portfolioBean.updatePortfolioValidityByPortfolioId(portfolioId, "VALID");
        request.getRequestDispatcher("/WEB-INF/pages/portfoliosPreview.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
