package com.xworkz.jdbc2.servlet;

import com.xworkz.jdbc2.dto.CollageDto;
import com.xworkz.jdbc2.service.CollageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/send")
public class CollageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String age=req.getParameter("age");
        String email=req.getParameter("email");
        String collageName=req.getParameter("collageName");
        String stream=req.getParameter("stream");

        CollageDto dto=new CollageDto(name,age,email,collageName,stream);
        CollageServiceImpl service=new CollageServiceImpl();
        service.save(dto);
    }
}
