package day04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/day04/rdrtTest.cls")
public class Test01_01 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		//할일
		//이 요청이 오면 /day04/fwdTest.csl 로 요청을 바꿔서 응답해주자.
		String view = "/jspcls/day04/fwdTest.cls?id="+req.getParameter("id")+"&pw="+req.getParameter("pw");
		try {
			resp.sendRedirect(view);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
