package com.pack1;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/cs")
public class ControllerServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ServletContext context = this.getServletContext();
		HttpSession session = req.getSession();

		context.setAttribute("a", 100);
		session.setAttribute("b", 200);
		req.setAttribute("c", 300);
		req.getRequestDispatcher("Display.jsp").forward(req, res);
	}
}
