package controller.ajax;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ClsMain;

public class jiwoo implements ClsMain{

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", null);
		StringBuffer buff = new StringBuffer();
		buff.append("{");
		buff.append("\"name\":\"jiwoo LEE\",");
		buff.append("\"age\":\"26\",");
		buff.append("\"gen\":\"man\",");
		buff.append("}");
		return buff.toString();
	}

}
