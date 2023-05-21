package com.javalect.springEx.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalect.springEx.vo.MemberVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "main/login";
	}
	
//	@RequestMapping(value="/webtest", method=RequestMethod.GET)
//	public String test(HttpServletRequest servletRequest, Model model) {
//		String id = servletRequest.getParameter("id");
//		String pw = servletRequest.getParameter("pw");
//		model.addAttribute("id", id);
//		model.addAttribute("pw", pw);
//		
//		return "main/webtest";
//	}
	
	@RequestMapping(value="/webtest", method=RequestMethod.GET)
	public String test2(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "main/webtest";
	}
	
	@RequestMapping(value="/member", method=RequestMethod.GET)
	public String test(MemberVo memberVo) {
		
		return "main/member";
	}
}
