package com.xworkz.jdbc.person.servlet;

import com.xworkz.jdbc.person.dto.PersonDto;
import com.xworkz.jdbc.person.service.PersonServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        int idConverted=Integer.valueOf("id");
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String phoneNo=req.getParameter("phoneNo");
        long phoneNoConverted=Long.valueOf("phoneNo");
        String password=req.getParameter("password");

        PersonDto personDto=new PersonDto(idConverted,name,email,phoneNoConverted,password);
        PersonServiceImpl personService=new PersonServiceImpl();
        personService.save(personDto);
        personService.getListOfDataById(String data);
        personService.getNameAndEmailById(name,email);
        personService.ifEmailAndPasswordSameByData(personDto);
    }
}
