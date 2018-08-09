package com.marlabs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.marlabs.model.Admin;



@RestController
@RequestMapping(value="/admin")
public class AdminController {
	
	
	@Value("${userid}")
	private String userid;
	@Value("${pwd}")
	private String password;

	public AdminController() 
	{
	
		System.out.println(this.getClass().getSimpleName()+"object created");
	}
	
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public ModelAndView loginAdminController(Admin admin)
	{
		System.out.println("login admin controller started");
		System.out.println(admin);
		System.out.println(userid+"\t"+password);
		
		if(admin.getUserid().equals(userid)&& admin.getPassword().equals(password))
		{
			System.out.println("Admin login success");
			ModelAndView modelAndView=new ModelAndView("home");
			modelAndView.addObject("admin",new Admin());
			return modelAndView;
		}
		
		System.out.println("login admin controller ended");
		return new ModelAndView("admin-login-form","msg","userid or password is incorrect");
	}
	
}
