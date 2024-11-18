package com.xworkz.jdbc1.servlet;

import com.xworkz.jdbc1.dto.TripDto;
import com.xworkz.jdbc1.service.TripServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save");
public class TripServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String placeName=req.getParameter("placeName");
        String distance=req.getParameter("distance");
        String district=req.getParameter("district");
        TripDto dto=new TripDto(placeName,distance,district);
        TripServiceImpl service=new TripServiceImpl();
        service.save(dto);

        RequestDispatcher dispatcher= new RequestDispatcher();
        dispatcher.forward(req,resp);
    }
}
