package com.guarderia.app.web.controllers;

import com.guarderia.app.web.models.entities.Representante;
import com.guarderia.app.web.models.services.IRepresentanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/representante")
public class RepresentanteController {

    @Autowired
    private IRepresentanteService service;

    @GetMapping(value="/create")
    public String create(Model model) {
        Representante representante =new Representante();
        model.addAttribute("representante",representante);
        return "representante/form";
    }

    @GetMapping(value="/retrieve/{id}")
    public String retrieve(@PathVariable(value="id") Integer id, Model model) {
        Representante representante = service.findById(id);
        model.addAttribute("representante",representante);
        return "representante/card";
    }

    @GetMapping(value="/update/{id}")
    public String update(@PathVariable(value="id") Integer id, Model model) {
        Representante representante = service.findById(id);
        model.addAttribute("representante",representante);
        return "representante/form";
    }

    @GetMapping(value="/delete{id}")
    public String delete(@PathVariable(value="id") Integer id, Model model) {
        try {
            service.delete(id);
        }
        catch(Exception ex) {
            model.addAttribute("error",ex.toString());
        }
        return "redirect:representante/list";
    }

    @GetMapping(value="/list")
    public String list(Model model) {
        List<Representante> representantes=service.findAll();
        model.addAttribute("representantes",representantes);
        return "representante/list";
    }

    @PostMapping(value="/save")
    public String save(Representante representante,Model model) {
        try {
            service.save(representante);
        }
        catch(Exception ex){
            model.addAttribute("error",ex.toString());
        }
        return "redirect:/representante/list";
    }

}
