package com.increpas.cls.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controller.ClsMain;

public class Login implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		HttpSession session = req.getSession();
		
		String sid = (String)session.getAttribute("SID");
		String view = "member/Login";
		if(sid == null) {
			req.setAttribute("isRedirect", false);
		}else {
			req.setAttribute("isRedirect", true);
			view = "/jspcls/main.cls";
			
		}
		return view;
	}
}
