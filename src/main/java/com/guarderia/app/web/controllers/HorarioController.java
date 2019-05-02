package com.guarderia.app.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.guarderia.app.web.models.entities.Horario;
import com.guarderia.app.web.models.services.IHorarioService;

@Controller
@RequestMapping(value="/horario")
public class HorarioController {
	
	@Autowired
	private IHorarioService service;
	

	@GetMapping(value="/create")
	public String create(Model model) {
		Horario horario =new Horario();
		model.addAttribute("horario",horario);
		return "horario/form";
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id, Model model) {
		Horario horario = service.findById(id);
		model.addAttribute("horario",horario);
		return "horario/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Horario horario = service.findById(id);
		model.addAttribute("horario",horario);
		return "horario/form";
	}
	
	@GetMapping(value="/delete{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		try {
			service.delete(id);
		}
		catch(Exception ex) {
			model.addAttribute("error",ex.toString());
		}
		return "redirect:horario/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Horario> horarios=service.findAll();
		model.addAttribute("horarios",horarios);
		return "horario/list";
	}
	
	@PostMapping(value="/save")
	public String save(Horario horario,Model model) {
		try {
			service.save(horario);
		}
		catch(Exception ex){
			model.addAttribute("error",ex.toString());
		}
		return "redirect:/horario/list";	
	}
	


}
