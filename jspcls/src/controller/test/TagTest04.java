package controller.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import util.*;
import controller.ClsMain;

public class TagTest04 implements ClsMain {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("isRedirect", false);
		SetColor sc = new SetColor();
		ArrayList arr = sc.setColor();
		ArrayList name = new ArrayList();
		name.add("이지우");
		name.add("이리우");
		name.add("이히우");
		name.add("이니우");
		name.add("이비우");
		name.add("이디우");
		name.add("이기우");
//		HashMap amp = new HashMap();
//		for(int i = 0; i < arr.size(); i++) {
//			amp.put(arr.get(i), name.get(i));
//		}
		req.setAttribute("HELLO", name);
		req.setAttribute("COLOR", arr);
		String view = "test/foreach04";
		return view;
	}

}
