package day03;

import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.*;

import day03.dao.*;
@WebServlet("/day03/loginProc.cls")
public class loginproc extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		String sid = req.getParameter("id");
		String spw = req.getParameter("pw");
		
		MemberDAO mDao = new MemberDAO();
		int cnt = mDao.getLoginCnt(sid, spw);
		
		String view = "/jspcls/pre/main.cls";
		
		if(cnt !=1) {
			view = "/jspcls/day03/login.cls";
		}else {
			
			//이외의 경우는 로그인에 성공한 경우이므로 메인페이지로 이동시키니다.
			//먼저 세션을 꺼내온다.
			HttpSession session = req.getSession();
			session.setAttribute("SID", sid);
		}
		
		
		
		try {
			resp.sendRedirect(view);
		}catch(Exception e) {
			System.out.println("프로그램오류 bbssggww");
			e.printStackTrace();
		}
	}
}
