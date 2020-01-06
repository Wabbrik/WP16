package com.mycompany.online_admission.servlet.portfolio;

import com.mycompany.online_admission.common.RegistrationFormDetails;
import com.mycompany.online_admission.ejb.RegistrationFormBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EditPortfolio", urlPatterns = {"/Portfolios/Update"})
public class EditPortfolio extends HttpServlet {
@Inject RegistrationFormBean registrationFormBean;
    
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer rfdId = Integer.parseInt(request.getParameter("id"));
        RegistrationFormDetails rfd = registrationFormBean.getRegistrationFormByRegistrationFormId(rfdId);
        request.setAttribute("rf", rfd);
        request.getRequestDispatcher("/WEB-INF/pages/portfoliosFullUpdate.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer rfdId = Integer.parseInt(request.getParameter("id"));
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
        String address = request.getParameter("address");           //TODO:????
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
        RegistrationFormDetails registrationFormDetails=new RegistrationFormDetails(rfdId, lastNameAtBirth, lastName, firstName, dadFirstName, momFirstName, pid, birthdate, placeOfBirthCountry, placeOfBirthCounty, placeOfBirthCity, civilStatus, specialSocialSituation, citizenship, ethnicity, homeAddressCountry, homeAddressCounty, homeAddressCity, homeAddressStrNrFlAp, idCardSeries, idCardNumber, idCardReleasedBy, idCardReleaseDate, idCardExpiryDate, contactPhoneNumber, contactParentPhoneNumber, contactEmail, disability, preuniversitarStudiesInstitution, preuniversitarStudiesCountry, preuniversitarStudiesCounty, preuniversitarStudiesCity, preuniversitarStudiesDomain, preuniversitarStudiesLength, preuniversitarStudiesGraduationYear, preuniversitarStudiesType, bacDiplomaSeries, bacDiplomaNumber, bacDiplomaReleasedBy, bacDiplomaReleaseDateYear, remarks, option1, option2, option3);
        registrationFormBean.updateRegistrationBean(registrationFormDetails);
        response.sendRedirect(request.getContextPath()+"/InvalidPortfolios");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
