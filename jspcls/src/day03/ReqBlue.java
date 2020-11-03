package day03;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/day03/reqblue.cls")
public class ReqBlue extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String view = "/jspcls/day03/reqRed.jsp";
		try {
			resp.sendRedirect(view);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
