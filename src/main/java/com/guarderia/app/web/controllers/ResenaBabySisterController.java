package com.guarderia.app.web.controllers;

import com.guarderia.app.web.models.entities.ResenaBabySister;
import com.guarderia.app.web.models.services.IResenaBabySisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/resenababysister")
public class ResenaBabySisterController {

    @Autowired
    private IResenaBabySisterService service;

    @GetMapping(value="/create")
    public String create(Model model) {
        ResenaBabySister resenaBabySister =new ResenaBabySister();
        model.addAttribute("resenaBabySister",resenaBabySister);
        return "resenaBabySister/form";
    }

    @GetMapping(value="/retrieve/{id}")
    public String retrieve(@PathVariable(value="id") Integer id, Model model) {
        ResenaBabySister resenaBabySister = service.findById(id);
        model.addAttribute("resenaBabySister",resenaBabySister);
        return "resenaBabySister/card";
    }

    @GetMapping(value="/update/{id}")
    public String update(@PathVariable(value="id") Integer id, Model model) {
        ResenaBabySister resenaBabySister = service.findById(id);
        model.addAttribute("resenaBabySister",resenaBabySister);
        return "resenaBabySister/form";
    }

    @GetMapping(value="/delete{id}")
    public String delete(@PathVariable(value="id") Integer id, Model model) {
        try {
            service.delete(id);
        }
        catch(Exception ex) {
            model.addAttribute("error",ex.toString());
        }
        return "redirect:resenaBabySister/list";
    }

    @GetMapping(value="/list")
    public String list(Model model) {
        List<ResenaBabySister> resenasBabySister=service.findAll();
        model.addAttribute("resenasBabySister",resenasBabySister);
        return "resenaBabySister/list";
    }

    @PostMapping(value="/save")
    public String save(ResenaBabySister resenaBabySister,Model model) {
        try {
            service.save(resenaBabySister);
        }
        catch(Exception ex){
            model.addAttribute("error",ex.toString());
        }
        return "redirect:/resenaBabySister/list";
    }

}
