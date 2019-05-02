package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Social;
import com.guarderia.app.web.models.services.ISocialService;

@Controller
@RequestMapping(value="/social")
public class SocialController {


	@Autowired
	private ISocialService service;
	
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, Model model)
	{
		Social social = service.findById(id);
		model.addAttribute("social",social);
		return "social/card";		
	}
	
	@PostMapping(value="/save")
	public String save(Social social, Model model){
		try {
			service.save(social);
		}catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/social/list";
	}
	
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id, Model model)
	{
		Social social = service.findById(id);
		model.addAttribute("social",social);
		return "social/form";		
	}
	
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Social> social = service.findAll();
		model.addAttribute("social", social);
		return "social/list";
	}
	
}
