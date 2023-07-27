package com.imaad.flight.controller;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.imaad.flight.enitity.User;
import com.imaad.flight.repositery.UserRepository;
@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	
	@RequestMapping(value = "/star")
	public String showRegestionPage() {
		System.out.println("in show regesteration page  method");
		
		return "login/registerUser1";
	}
	
	@RequestMapping(value = "/regesterlogin")
	public String regesterlongin(@ModelAttribute("user") User user) {
		System.out.println("in regester login method");
		userRepository.save(user);
		return "login/login";}
		
	@RequestMapping("/loginghref")
		public String loginHref() {
			return "login/login";
		
		
	}
	@RequestMapping(value ="/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String passsword , ModelMap modelmap) {
		User user = userRepository.findByEmail(email);
		System.out.println(email);
		System.out.println(passsword);
		System.out.println(user);
		if (user.getPassword().equals(passsword)) {
			return"flight/findflight";
			
		} else {
			System.out.println("in else block");

			modelmap.addAttribute("msg", "invalid password");
			
		}
		return "login/login";
	}
	 

}
