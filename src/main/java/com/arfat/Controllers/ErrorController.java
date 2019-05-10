package com.arfat.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

	@RequestMapping("/error")
	public ModelAndView errorPage() {
		ModelAndView m = new ModelAndView("404");
		return m;
	}
	
	@Override
	public String getErrorPath() {
		return "/";
	}

}
