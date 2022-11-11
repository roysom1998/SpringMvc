package com.somraj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	
	@RequestMapping("/add")
	public ModelAndView Addition(@RequestParam("n1") int i, @RequestParam("n2") int j) {
		
		ModelAndView mv=new ModelAndView();
		int r=i+j;
		mv.addObject("result", r);
		mv.setViewName("show.jsp");
		return mv;
	}
}
