package com.eng.controllers;

 
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CityController {
	
	@RequestMapping("/")
	public String home(HttpSession session) {
		
		session.setAttribute("message", "Home page of this application");
		return "home";
	}
	
	@RequestMapping("/city")
	public ModelAndView showHome() {  		 
		
		ModelAndView mv = new ModelAndView("city");		
		Map<String, Object> model = mv.getModel();		
		model.put("name", "Moscow");	
		 
		return mv;
	}
	
	@RequestMapping("/about")
	public String showHome(Model model) {		
		model.addAttribute("bestWay", "<strong>This is how it should be done!</strong>");
		model.addAttribute("secondAttr", "<strong>this should filter mallicious input, like tags for example</strong>");
		return "about";
	}
}
