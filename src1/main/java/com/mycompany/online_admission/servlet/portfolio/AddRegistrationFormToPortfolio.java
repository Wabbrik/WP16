package com.mycompany.online_admission.servlet.portfolio;


import com.mycompany.online_admission.ejb.PortfolioBean;
import com.mycompany.online_admission.ejb.UserBean;
import com.mycompany.online_admission.entity.Portfolio;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@ServletSecurity(value = @HttpConstraint(rolesAllowed = {"ClientRole"}))
@WebServlet(name = "AddRegistrationFormToPortfolio", urlPatterns = {"/AddRegistrationFormToPortfolio"})
public class AddRegistrationFormToPortfolio extends HttpServlet {

    @Inject UserBean userBean;
    @Inject PortfolioBean portfolioBean;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentUser = userBean.getContext().getCallerPrincipal().getName();
        Integer userId = userBean.getIdByUsername(currentUser);
        boolean areDosar=userBean.hasUserPortfolio(userId);
        if(!areDosar){
            portfolioBean.createPortfolio("NEVALID", userId);
        }
        Integer portfolioId=portfolioBean.getPortfolioByUserId(userId).getId();
        if(portfolioBean.hasUserAlreadySubmittedRegistrationForm(userId)){
            request.setAttribute("message","Ai completat deja formularul necesar inscrierii!");
            request.getRequestDispatcher("/WEB-INF/pages/aiCompletatDeja.jsp").forward(request, response);
        }
        request.getRequestDispatcher("/WEB-INF/pages/matriculation.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentUser = userBean.getContext().getCallerPrincipal().getName();
        Integer userId = userBean.getIdByUsername(currentUser);
        Integer portfolioId=portfolioBean.getPortfolioByUserId(userId).getId();
        
        String lastNameAtBirth = request.getParameter("lastNameAtBirth");
        String lastName = request.getParameter("lastName");
        String firstName = request.getParameter("firstName");
        String dadFirstName = request.getParameter("dadFirstName");
        String momFirstName = request.getParameter("momFirstName");
        String pid = request.getParameter("pid");
        String birthdate = request.getParameter("birthday");
        String placeOfBirthCountry = request.getParameter("placeOfBirthCountry");
        String placeOfBirthCounty = request.getParameter("placeOfBirthCounty");
        String placeOfBirthCity = request.getParameter("placeOfBirthCity");
        String civilStatus = request.getParameter("civilStatus");
        String specialSocialSituation = request.getParameter("specialSocialSituation");
        String citizenship = request.getParameter("citizenship");
        String ethnicity = request.getParameter("ethnicity");
        String homeAddressCountry = request.getParameter("homeAddressCountry");
        String homeAddressCounty = request.getParameter("homeAddressCounty");
        String homeAddressCity = request.getParameter("homeAddressCity");
        String homeAddressStrNrFlAp = request.getParameter("homeAddressStrNrFlAp");
        String idCardSeries = request.getParameter("idCardSeries");
        String idCardNumber = request.getParameter("idCardNumber");
        String idCardReleasedBy = request.getParameter("idCardReleasedBy");
        String idCardReleaseDate = request.getParameter("idCardReleaseDate");
        String idCardExpiryDate = request.getParameter("idCardExpiryDate");
        String address = request.getParameter("address");
        String contactPhoneNumber = request.getParameter("contactPhoneNumber");
        String contactParentPhoneNumber = request.getParameter("contactParentPhoneNumber");
        String contactEmail = request.getParameter("contactEmail");
        String disability = request.getParameter("disability");
        String preuniversitarStudiesInstitution = request.getParameter("preuniversitarStudiesInstitution");
        String preuniversitarStudiesCountry = request.getParameter("preuniversitarStudiesCountry");
        String preuniversitarStudiesCounty = request.getParameter("preuniversitarStudiesCounty");
        String preuniversitarStudiesCity = request.getParameter("preuniversitarStudiesCity");
        String preuniversitarStudiesDomain = request.getParameter("preuniversitarStudiesDomain");
        String preuniversitarStudiesLength = request.getParameter("preuniversitarStudiesLength");
        String preuniversitarStudiesGraduationYear = request.getParameter("preuniversitarStudiesGraduationYear");
        String preuniversitarStudiesType = request.getParameter("preuniversitarStudiesType");
        String bacDiplomaSeries = request.getParameter("bacDiplomaSeries");
        String bacDiplomaNumber = request.getParameter("bacDiplomaNumber");
        String bacDiplomaReleasedBy = request.getParameter("bacDiplomaReleasedBy");
        String bacDiplomaReleaseDateYear = request.getParameter("bacDiplomaReleaseDateYear");
        String remarks = request.getParameter("remarks");
        String option1 = request.getParameter("option1");
        String option2 = request.getParameter("option2");
        String option3 = request.getParameter("option3");
        
        portfolioBean.addRegistrationFormToPortfolio(portfolioId, lastNameAtBirth, lastName, firstName, dadFirstName, momFirstName, pid, birthdate, placeOfBirthCountry, placeOfBirthCounty, placeOfBirthCity, civilStatus, specialSocialSituation, citizenship, ethnicity, homeAddressCountry, homeAddressCounty, homeAddressCity, homeAddressStrNrFlAp, idCardSeries, idCardNumber, idCardReleasedBy, idCardReleaseDate, idCardExpiryDate, contactPhoneNumber, contactParentPhoneNumber, contactEmail, disability, preuniversitarStudiesInstitution, preuniversitarStudiesCountry, preuniversitarStudiesCounty, preuniversitarStudiesCity, preuniversitarStudiesDomain, preuniversitarStudiesLength, preuniversitarStudiesGraduationYear, preuniversitarStudiesType, bacDiplomaSeries, bacDiplomaNumber, bacDiplomaReleasedBy, bacDiplomaReleaseDateYear, remarks, option1, option2, option3);
        
        request.getRequestDispatcher("/WEB-INF/pages/addDocuments.jsp").forward(request, response);
        
       
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
