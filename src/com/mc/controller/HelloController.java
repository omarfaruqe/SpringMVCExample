package com.mc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("index");
		model.addObject("welcomeMessage","hello world");

		return model;
	}

}

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