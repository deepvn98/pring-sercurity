package com.cmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	@RequestMapping("")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	@RequestMapping("/home")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView("home");
		return model;
	}
	
	@RequestMapping("/admin")
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView("admin");

		return model;
	}
	
	@RequestMapping("/logout")

	public String logout(Model model) {

	 model.addAttribute("message", "Logout success!");

	return "index";

	}
	

}
