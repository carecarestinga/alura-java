package br.com.alura.gerenciador.web;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class Logout extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getSession().setMaxInactiveInterval(10*60);
		req.getSession().removeAttribute("usuario.logado");
		//req.getSession().invalidate();
		RequestDispatcher dispatcher =  req.getRequestDispatcher("/WEB-INF/paginas/logout.html");
		dispatcher.forward(req, resp);
	}
}
