package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.apache.catalina.connector.Request;

@WebServlet({ "/home/main.do", "/bang/index.do", "/dap/index.do" })
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String path = request.getServletPath().substring(+1);
		String url = "";
		switch (path) {
		case "home/main.do":
			url = "/home/main.jsp";
			break;
		case "bang/index.do":
			url = "ch13";
			break;
		case "dap/index.do":
			url = "ch14";
			break;
		default:
			break;
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
