package com.carloscaicedo.counter.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/your_server")
	public String setCount(HttpSession session) {
		// check if session has "count"
		if(session.getAttribute("count")==null) { //no count, create count in session
			session.setAttribute("count", 1);
		} else { // count is available, increment count
			Integer count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}

	
	@RequestMapping("/counterbytwo")
	public String couter() {					
	    return "counterbytwo.jsp";
	}

}



