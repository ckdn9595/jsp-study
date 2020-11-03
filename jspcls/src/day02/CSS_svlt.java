package day02;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet({"/css/*", "/js/*", "/img/*"})*/
public class CSS_svlt extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String url = req.getRequestURI();
		// /jspcls/css/w3.css   /jspcls/js/jquery-3.5.1.min.js
		url = url.substring(7);
		
		System.out.println("url : " + url);
	}
}
