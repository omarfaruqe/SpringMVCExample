package com.mc.admissioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");
//model.addObject("headerMessage","Montreal College of Management and Technology");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model1){
		model1.addAttribute("headerMessage","Montreal College of Management and Technology");
	}
		
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1) {

		ModelAndView model = new ModelAndView("AdmissionSuccess");
//model.addObject("headerMessage","MT College");

		return model;
	}
}