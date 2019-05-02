package com.guarderia.app.web.controllers;

import com.guarderia.app.web.models.entities.Child;
import com.guarderia.app.web.models.services.IChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/child")
public class ChildController {

    @Autowired
    private IChildService service;

    @GetMapping(value="/create")
    public String create(Model model) {
        Child child =new Child();
        model.addAttribute("child",child);
        return "child/form";
    }

    @GetMapping(value="/retrieve/{id}")
    public String retrieve(@PathVariable(value="id") Integer id, Model model) {
        Child child = service.findById(id);
        model.addAttribute("child",child);
        return "child/card";
    }

    @GetMapping(value="/update/{id}")
    public String update(@PathVariable(value="id") Integer id, Model model) {
        Child child = service.findById(id);
        model.addAttribute("child",child);
        return "child/form";
    }

    @GetMapping(value="/delete{id}")
    public String delete(@PathVariable(value="id") Integer id, Model model) {
        try {
            service.delete(id);
        }
        catch(Exception ex) {
            model.addAttribute("error",ex.toString());
        }
        return "redirect:child/list";
    }

    @GetMapping(value="/list")
    public String list(Model model) {
        List<Child> children=service.findAll();
        model.addAttribute("children",children);
        return "child/list";
    }

    @PostMapping(value="/save")
    public String save(Child child,Model model) {
        try {
            service.save(child);
        }
        catch(Exception ex){
            model.addAttribute("error",ex.toString());
        }
        return "redirect:/child/list";
    }

}
