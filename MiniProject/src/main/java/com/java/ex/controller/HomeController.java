package com.java.ex.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.ex.dao.UserDao;
import com.java.ex.dto.User;





/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private final UserDao userDao = new UserDao();
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	@RequestMapping(value = "/header", method = RequestMethod.GET)
	public String header() {
		return "main/header";
	}
	
	@RequestMapping(value = "/error1", method = RequestMethod.GET)
	public String error() {
		return "error/500";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		return "top/list";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "top/login";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "top/join";
	}
	
	@RequestMapping(value ="/boardMain", method = RequestMethod.GET)
	public String boardMain() {
		return "board/boardMain";
	}
	
	@RequestMapping(value ="/joinUser", method = RequestMethod.POST)
	public String joinUser(User userDto) {
		int user1 = userDao.joinUser(userDto);
		return "/login";
	}
}
