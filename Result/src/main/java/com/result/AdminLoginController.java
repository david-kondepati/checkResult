package com.result;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminLoginController {
	
	@PostMapping("/validateAdmin")
	public ModelAndView admin(@RequestParam("email") String email, @RequestParam("password") String password) {
		
		ModelAndView mv = null;
		
		if(email.equals("admin@nareshit.com")&& password.equals("Nareshit@123")) {
			mv = new ModelAndView("welcome-admin");
		}
		
		else {
			mv = new ModelAndView("error");
		}
		
		
		return mv;
	}
}
