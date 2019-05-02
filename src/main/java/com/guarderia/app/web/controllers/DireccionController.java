package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Direccion;
import com.guarderia.app.web.models.services.IDireccionService;



@Controller
@RequestMapping(value="/direccion")
public class DireccionController {
	
	@Autowired
	private IDireccionService service;
	
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id")Integer id, Model model)
	{
		Direccion direccion = service.findById(id);
		model.addAttribute("direccion",direccion);
		return "direccion/card";		
	}
	
	
	@PostMapping(value="/save")
	public String save(Direccion direccion, Model model){
		try {
			service.save(direccion);
		}catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/direccion/list";
	}

	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id")Integer id, Model model)
	{
		Direccion direccion = service.findById(id);
		model.addAttribute("direccion",direccion);
		return "direccion/form";		
	}
	
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Direccion> direccion = service.findAll();
		model.addAttribute("direccion", direccion);
		return "direccion/list";
	}
}
