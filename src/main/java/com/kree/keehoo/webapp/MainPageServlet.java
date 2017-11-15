package com.kree.keehoo.webapp;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(urlPatterns = "/")
public class MainPageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String passedData = "Data which has been passed form servlet to html";

        List<String> listToBePassed = Arrays.asList("jeden", "dwa", "trzy", "cztery");

        req.setAttribute("variable", passedData);
        req.setAttribute("list", listToBePassed);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/pages/index.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("User name : "+username);
        System.out.println("User pswd : "+password);

    }
}
