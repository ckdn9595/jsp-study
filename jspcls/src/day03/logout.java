package day03;

import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day03/logout.cls")
public class logout extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		session.removeAttribute("SID");
		
		String view = "/jspcls/day03/login.cls";
		try {
			resp.sendRedirect(view);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
