package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController
{

	@Autowired
	HomeService hs;

	@RequestMapping("/*")
	public String error()
	{
		return "error";
	}
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}

	@RequestMapping("/registration")
	public String preRegister()
	{

		return "registration";
	}

	@RequestMapping("/reg")
	public String registerData(@ModelAttribute Student s)
	{

		hs.saveData(s);

		return "login";
	}

	@RequestMapping("/login")
	public String loginCheck(@RequestParam("uname") String un,@RequestParam("password") String ps,ModelMap m)
	{

		Student s=hs.logincheck(un,ps);

		Iterable<Student> list=hs.displayAllData();

		m.addAttribute("data", list);

		return "success";
	}

	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute Student s,ModelMap m)
	{
		hs.deleteData(s);// delete

		Iterable<Student> list=hs.displayAllData(); //Display
		m.addAttribute("data", list);
		return "success";
	}


	@RequestMapping("/edit")
	public String editData(@RequestParam("uid") int uid,ModelMap m)
	{
		Student s=hs.editData(uid);
		
		m.addAttribute("data", s);
	
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,ModelMap m)
	{
		hs.saveData(s);
		Iterable<Student> list=hs.displayAllData(); //Display
		m.addAttribute("data", list);
		return "success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
