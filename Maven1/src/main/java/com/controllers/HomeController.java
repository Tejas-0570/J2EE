package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.controllers.models.Users;
import com.controllers.services.UserService;


@Controller  // Marks a class as a Spring MVC controller that handles web requests.
public class HomeController {
	
	@Autowired // Automatically injects the required dependency into the class.
	UserService us;
	
	
	@RequestMapping("/register")  // Maps HTTP requests to the specified URL path or controller method.
	public String Register() {
		return "Register";
	}
	
	@RequestMapping("/Savedata")
	public String Savedata(@ModelAttribute Users u) { // Binds a method parameter or form data to a model attribute.
		us.register(u);
		return "redirect:/Login";
	}
	
	@RequestMapping("/display")
	public String Display(Model m) {
		List<Users> l = us.display();
		m.addAttribute("temp", l);
		return "Display";
	}
	
	@RequestMapping("/Edit/{id}")
	public String Edit(@PathVariable("id") int id, Model m) {
		
		Users u = us.Edit(id);
		m.addAttribute("temp", u);
		return "EditForm";
	}
	
	@RequestMapping("/Delete/{id}")
	public String Delete(@PathVariable("id") int id) {
		us.Delete(id);
		return "redirect:/display";
	}
	
	@RequestMapping("/Update")
	public String Update(@ModelAttribute Users u) {
		us.Update(u);
		return "redirect:/display";
	}
	
	@RequestMapping("/Login")
	public String Login() {
		return "Login";
	}
	
	@RequestMapping("/LoginUser")
	public String LoginUser(@ModelAttribute Users u, Model m) {
		Users user = us.Login(u);
		if(user != null) {
			return "redirect:/home";
		}
		else {
			m.addAttribute("error", "Invalid Credentials");
			return "Login";
		}
	}
	
	@RequestMapping("/home")
	public String Home() {
		return "Home";
	}
	

	
}