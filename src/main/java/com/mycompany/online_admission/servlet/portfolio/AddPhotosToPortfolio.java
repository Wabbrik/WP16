package com.mycompany.online_admission.servlet.portfolio;

import com.mycompany.online_admission.ejb.PortfolioBean;
import com.mycompany.online_admission.ejb.UserBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
@ServletSecurity(value = @HttpConstraint(rolesAllowed = {"ClientRole"}))
@WebServlet(name = "AddPhotosToPortfolio", urlPatterns = {"/AddPhotosToPortfolio"})
public class AddPhotosToPortfolio extends HttpServlet {
@Inject UserBean userBean;
@Inject PortfolioBean portfolioBean;
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentUser = userBean.getContext().getCallerPrincipal().getName();
        Integer userId = userBean.getIdByUsername(currentUser);
        if(!userBean.hasUserPortfolio(userId)){
            request.getRequestDispatcher("/WEB-INF/pages/matriculation.jsp").forward(request, response);
        }else{
        Integer portfolioId=portfolioBean.getPortfolioByUserId(userId).getId();
        if(portfolioBean.hasUserAlreadySubmittedPhotos(userId)){
            request.setAttribute("message","Ai trimis deja pozele necesare inscrerii!");
            request.getRequestDispatcher("/WEB-INF/pages/aiCompletatDeja.jsp").forward(request, response);
        }
        request.getRequestDispatcher("/WEB-INF/pages/addDocuments.jsp").forward(request, response);
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentUser = userBean.getContext().getCallerPrincipal().getName();
        Integer userId = userBean.getIdByUsername(currentUser);
        Integer portfolioId=portfolioBean.getPortfolioByUserId(userId).getId();
        
        Part filePart1=request.getPart("diplomaBac");
        String fileName1=filePart1.getSubmittedFileName();
        String fileType1=filePart1.getContentType();
        long fileSize1=filePart1.getSize();
        byte[]fileContent1=new byte[(int)fileSize1];
        filePart1.getInputStream().read(fileContent1);
        portfolioBean.addPhotoToPortfolio(portfolioId, fileName1, fileType1, fileContent1);
        
        Part filePart2=request.getPart("certificatNastere");
        String fileName2=filePart2.getSubmittedFileName();
        String fileType2=filePart2.getContentType();
        long fileSize2=filePart2.getSize();
        byte[]fileContent2=new byte[(int)fileSize2];
        filePart2.getInputStream().read(fileContent2);
        portfolioBean.addPhotoToPortfolio(portfolioId, fileName2, fileType2, fileContent2);
       
        Part filePart3=request.getPart("adeverintaMedicala");
        String fileName3=filePart3.getSubmittedFileName();
        String fileType3=filePart3.getContentType();
        long fileSize3=filePart3.getSize();
        byte[]fileContent3=new byte[(int)fileSize3];
        filePart3.getInputStream().read(fileContent3);
        portfolioBean.addPhotoToPortfolio(portfolioId, fileName3, fileType3, fileContent3);
        
        Part filePart4=request.getPart("fotografieProfil");
        String fileName4=filePart4.getSubmittedFileName();
        String fileType4=filePart4.getContentType();
        long fileSize4=filePart4.getSize();
        byte[]fileContent4=new byte[(int)fileSize4];
        filePart4.getInputStream().read(fileContent4);
        portfolioBean.addPhotoToPortfolio(portfolioId, fileName4, fileType4, fileContent4);
        
        Part filePart5=request.getPart("carteIdentitate");
        String fileName5=filePart5.getSubmittedFileName();
        String fileType5=filePart5.getContentType();
        long fileSize5=filePart5.getSize();
        byte[]fileContent5=new byte[(int)fileSize5];
        filePart5.getInputStream().read(fileContent5);
        portfolioBean.addPhotoToPortfolio(portfolioId, fileName5, fileType5, fileContent5);
        
        Part filePart6=request.getPart("chitantaPlata");
        String fileName6=filePart6.getSubmittedFileName();
        String fileType6=filePart6.getContentType();
        long fileSize6=filePart6.getSize();
        byte[]fileContent6=new byte[(int)fileSize6];
        filePart6.getInputStream().read(fileContent6);
        portfolioBean.addPhotoToPortfolio(portfolioId, fileName6, fileType6, fileContent6);
        request.setAttribute("message", "Te-ai inscris cu succes!");
        request.getRequestDispatcher("/WEB-INF/pages/confirmareInscriere.jsp").forward(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
