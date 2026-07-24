package com.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
     ServletContext context=req.getServletContext();
     context.setAttribute("msg1","This is from ServletContext");
     
     ServletConfig config=this.getServletConfig();
     
     req.setAttribute("msg3",config.getServletName());
     req.setAttribute("msg4", config.getInitParameter("msg4"));
     req.getRequestDispatcher("Display.jsp").forward(req, res);
     
    }
}
