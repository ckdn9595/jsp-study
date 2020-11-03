package controller.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

public class TagTest01 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		// TODO 
		req.setAttribute("isRedirect", false);
		String view = "test/foreach01";
		return view;
	}

}
