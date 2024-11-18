package com.xworkz.jdbc.servlet;

import com.xworkz.jdbc.dto.BusTicketDto;
import com.xworkz.jdbc.service.BusTicketServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/send")
public class BusTicketServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String phoneNo=req.getParameter("phoneNo");
        String email=req.getParameter("email");
        String age=req.getParameter("age");

        BusTicketDto dto=new BusTicketDto(name,phoneNo,email,age);
        BusTicketServiceImpl busTicketService=new BusTicketServiceImpl();
        busTicketService.save(dto);

        RequestDispatcher dispatcher=new RequestDispatcher() ;
        dispatcher.forward(req,resp);
    }
}
