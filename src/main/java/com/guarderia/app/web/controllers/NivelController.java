package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Nivel;
import com.guarderia.app.web.models.services.INivelService;

@Controller
@RequestMapping(value="/nivel")
public class NivelController {
	
	@Autowired
	private INivelService service;
	

	@GetMapping(value="/create")
	public String create(Model model) {
		Nivel nivel =new Nivel();
		model.addAttribute("nivel",nivel);
		return "nivel/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Nivel nivel = service.findById(id);
		model.addAttribute("nivel",nivel);
		return "nivel/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Nivel nivel = service.findById(id);
		model.addAttribute("nivel",nivel);
		return "nivel/form";
	}
	
	@GetMapping(value="/delete{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:nivel/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Nivel> niveles=service.findAll();
		model.addAttribute("niveles",niveles);
		return "nivel/list";
	}
	
	@PostMapping(value="/save")
	public String save(Nivel nivel,Model model) {
		try {
			service.save(nivel);
		}
		catch(Exception ex){
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/nivel/list";	
	}
	

}
