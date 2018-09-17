package com.spring.mvc.beginer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/showform")
	public String showForm() {
		return "helloworld-form";
	}
	@RequestMapping("/processform")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processformvertwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Yo! "+ theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
	@RequestMapping("/processformverthree")
	public String letsShoutDude(@RequestParam("studentName") String theName,Model model) {
		theName = theName.toUpperCase();
		String result = "Hi! "+ theName;
		model.addAttribute("message", result);
		return "helloworld";
	}
}
