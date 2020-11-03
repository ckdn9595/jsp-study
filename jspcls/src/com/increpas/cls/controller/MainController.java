package com.increpas.cls.controller;

import javax.servlet.http.*;

public class MainController implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		String view = "pre/main";
		
		System.out.println("view : " + view);
		return view;
	}

}
