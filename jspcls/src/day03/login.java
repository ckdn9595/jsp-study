package day03;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day03/login.cls")
public class login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/WEB-INF/views/day03/login.jsp";
		String sid = "";
		try {
			sid = (String)req.getSession().getAttribute("SID");
			if(sid == null) {
				view = "/jspcls/main.cls";
				
				resp.sendRedirect(view);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = req.getRequestDispatcher(view);
		try {
			rd.forward(req, resp);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
