package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Resena;
import com.guarderia.app.web.models.services.IResenaService;



@Controller
@RequestMapping(value="/resena")
public class ResenaController {


	@Autowired
	private IResenaService service;
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, Model model)
	{
		Resena resena = service.findById(id);
		model.addAttribute("resena",resena);
		return "resena/card";		
	}
	
	
	@PostMapping(value="/save")
	public String save(Resena resena, Model model){
		try {
			service.save(resena);
		}catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/resena/list";
	}
	
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id, Model model)
	{
		Resena resena = service.findById(id);
		model.addAttribute("resena",resena);
		return "resena/form";		
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Resena> resena = service.findAll();
		model.addAttribute("resena", resena);
		return "resena/list";
	}
}
