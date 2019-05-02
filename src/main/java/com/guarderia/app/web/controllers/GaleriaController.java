package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Galeria;
import com.guarderia.app.web.models.services.IGaleriaService;


@Controller
@RequestMapping(value="/galeria")
public class GaleriaController {
	
	@Autowired
	private IGaleriaService service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Galeria galeria =new Galeria();
		model.addAttribute("galeria",galeria);
		return "galeria/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Galeria galeria = service.findById(id);
		model.addAttribute("galeria",galeria);
		return "galeria/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Galeria galeria = service.findById(id);
		model.addAttribute("galeria",galeria);
		return "galeria/form";
	}
	
	@GetMapping(value="/delete{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:galeria/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Galeria> galerias=service.findAll();
		model.addAttribute("galerias",galerias);
		return "galeria/list";
	}
	
	@PostMapping(value="/save")
	public String save(Galeria galeria,Model model) {
		try {
			service.save(galeria);
		}
		catch(Exception ex){
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/galeria/list";	
	}
	


}
