package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guarderia.app.web.models.entities.Actividad;
import com.guarderia.app.web.models.services.IActividadService;

@Controller
@RequestMapping(value="/actividad")
public class ActividadController {
	
	@Autowired
	private IActividadService service;
	
	@GetMapping(value="/create")
	public String create(Model model) {
		Actividad actividad =new Actividad();
		model.addAttribute("actividad",actividad);
		return "actividad/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Actividad actividad = service.findById(id);
		model.addAttribute("actividad",actividad);
		return "actividad/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Actividad actividad = service.findById(id);
		model.addAttribute("actividad",actividad);
		return "actividad/form";
	}
	
	@GetMapping(value="/delete{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:actividad/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Actividad> actividades=service.findAll();
		model.addAttribute("actividades",actividades);
		return "actividad/list";
	}
	
	@PostMapping(value="/save")
	public String save(Actividad actividad,Model model) {
		try {
			service.save(actividad);
		}
		catch(Exception ex){
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/actividad/list";	
	}
	

}
