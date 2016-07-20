package com.mc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
//@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
//	public ModelAndView helloWorld(@PathVariable("userName") String name, @PathVariable("countryName") String country) {
	
	public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars) {

		String name = pathVars.get("userName");
		String country = pathVars.get("countryName");
		
		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","hello "+name+" You are from "+country);

		return model;
	}
	
}

//	@RequestMapping("/hi")
//	public ModelAndView hiWorld() {
//
//		ModelAndView model = new ModelAndView("index");
//		model.addObject("welcomeMessage","hi world");
//
//		return model;
//	}
//	
//	@RequestMapping("/")
//	public ModelAndView rootWorld() {
//
//		ModelAndView model = new ModelAndView("index");
//		model.addObject("welcomeMessage","Root world");
//
//		return model;
//	}
//	

//public class HelloController extends AbstractController{
// 
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest request,
//		HttpServletResponse response) throws Exception {
// 
//		ModelAndView modelandview = new ModelAndView("index");
//		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
//		
//		return modelandview;
//	}
//}