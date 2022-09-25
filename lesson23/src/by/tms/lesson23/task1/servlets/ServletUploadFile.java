package by.tms.lesson23.task1.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1, //1mb
        maxFileSize = 1024 * 1024 * 10, // 10mb
        maxRequestSize = 1024 * 1024 * 100 //100mb
)
public class ServletUploadFile extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Part partFile = request.getPart("file");
        String fileName = partFile.getSubmittedFileName();

        for (Part part : request.getParts()) {
            part.write("E:\\Java\\L\\TMS_Homework2\\lesson23\\" + fileName);
        }

        response.getWriter().println("File was uploaded successfully");


    }
}
