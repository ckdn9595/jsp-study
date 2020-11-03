package controller.test;

import javax.servlet.http.*;
import controller.*;
import java.util.*;
import controller.ClsMain;

public class TagTest02 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		ArrayList list = new ArrayList();
		list.add("이지우");
		list.add("이리우");
		list.add("이히우");
		list.add("이니우");
		list.add("이비우");
		list.add("이디우");
		list.add("이기우");
		list.add("이시우");
		list.add("이미우");
		list.add("이키우");
		list.add("이티우");
		list.add("이치우");
		list.add("이피우");
		
		req.setAttribute("ARR", list);
		
	
		return "test/foreach02";
	}

}
