package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.guarderia.app.web.models.entities.Servicio;
import com.guarderia.app.web.models.services.IServicioService;

@Controller
@RequestMapping(value="/servicio")
public class ServicioController {
	
	@Autowired
	private IServicioService service;
	

	@GetMapping(value="/create")
	public String create(Model model) {
		Servicio servicio =new Servicio();
		model.addAttribute("servicio",servicio);
		return "servicio/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Servicio servicio = service.findById(id);
		model.addAttribute("servicio",servicio);
		return "servicio/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Servicio servicio = service.findById(id);
		model.addAttribute("servicio",servicio);
		return "servicio/form";
	}
	
	@GetMapping(value="/delete{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:servicio/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Servicio> servicios=service.findAll();
		model.addAttribute("servicios",servicios);
		return "servicio/list";
	}
	
	@PostMapping(value="/save")
	public String save(Servicio servicio,Model model) {
		try {
			service.save(servicio);
		}
		catch(Exception ex){
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/servicio/list";	
	}
	


}
