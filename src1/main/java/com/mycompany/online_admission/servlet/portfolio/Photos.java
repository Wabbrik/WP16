package com.mycompany.online_admission.servlet.portfolio;

import com.mycompany.online_admission.common.PhotoDetails;
import com.mycompany.online_admission.ejb.PhotoBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Photos", urlPatterns = {"/Portfolios/Photos"})
public class Photos extends HttpServlet {
@Inject PhotoBean photoBean;
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer photoId=Integer.parseInt(request.getParameter("id"));
        PhotoDetails photo=photoBean.getPhotoByPhotoId(photoId);
        if(photo!=null){
            response.setContentType(photo.getFileType());
            response.setContentLength(photo.getFileContent().length);
            response.getOutputStream().write(photo.getFileContent());
        }else{
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
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
