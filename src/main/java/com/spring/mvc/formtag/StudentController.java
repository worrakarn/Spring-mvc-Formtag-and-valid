package com.spring.mvc.formtag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String showForm(Model model) {
		//create a student object
		//Student theStudent = new Student();
		//add student object to the model
		model.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry());
		return "student-confirmation";
	}
}
