package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Guarderia;
import com.guarderia.app.web.models.services.IGuarderiaService;


@Controller
@RequestMapping(value="/guarderia")
public class GuarderiaController {
	
	@Autowired
	private IGuarderiaService service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Guarderia guarderia =new Guarderia();
		model.addAttribute("guarderia",guarderia);
		return "guarderia/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Guarderia guarderia = service.findById(id);
		model.addAttribute("guarderia",guarderia);
		return "guarderia/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Guarderia guarderia = service.findById(id);
		model.addAttribute("guarderia",guarderia);
		return "guarderia/form";
	}
	
	@GetMapping(value="/delete{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:guarderia/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Guarderia> guarderias=service.findAll();
		model.addAttribute("guarderias",guarderias);
		return "guarderia/list";
	}
	
	@PostMapping(value="/save")
	public String save(Guarderia guarderia,Model model) {
		try {
			service.save(guarderia);
		}
		catch(Exception ex){
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/guarderia/list";	
	}
	


}
