package com.guarderia.app.web.controllers;

import com.guarderia.app.web.models.entities.BabySister;
import com.guarderia.app.web.models.services.IBabySisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/babysister")
public class BabySisterController {

    @Autowired
    private IBabySisterService service;

    @GetMapping(value="/create")
    public String create(Model model) {
        BabySister babySister =new BabySister();
        model.addAttribute("babySister",babySister);
        return "babySister/form";
    }

    @GetMapping(value="/retrieve/{id}")
    public String retrieve(@PathVariable(value="id") Integer id, Model model) {
        BabySister babySister = service.findById(id);
        model.addAttribute("babySister",babySister);
        return "babySister/card";
    }

    @GetMapping(value="/update/{id}")
    public String update(@PathVariable(value="id") Integer id, Model model) {
        BabySister babySister = service.findById(id);
        model.addAttribute("babySister",babySister);
        return "babySister/form";
    }

    @GetMapping(value="/delete{id}")
    public String delete(@PathVariable(value="id") Integer id, Model model) {
        try {
            service.delete(id);
        }
        catch(Exception ex) {
            model.addAttribute("error",ex.toString());
        }
        return "redirect:babySister/list";
    }

    @GetMapping(value="/list")
    public String list(Model model) {
        List<BabySister> babySisters=service.findAll();
        model.addAttribute("babySisters",babySisters);
        return "babySister/list";
    }

    @PostMapping(value="/save")
    public String save(BabySister babySister,Model model) {
        try {
            service.save(babySister);
        }
        catch(Exception ex){
            model.addAttribute("error",ex.toString());
        }
        return "redirect:/babySister/list";
    }

}
