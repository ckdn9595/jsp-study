package day02;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/w3.css")
public class css extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/resources/css/w3.css";
		
		RequestDispatcher rd = req.getRequestDispatcher(view);

		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
