package com.guarderia.app.web.controllers;

import com.guarderia.app.web.models.entities.ReservaBabySister;
import com.guarderia.app.web.models.services.IReservaBabySisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/reservababysister")
public class ReservaBabySisterController {

    @Autowired
    private IReservaBabySisterService service;

    @GetMapping(value="/create")
    public String create(Model model) {
        ReservaBabySister reservaBabySister =new ReservaBabySister();
        model.addAttribute("reservaBabySister",reservaBabySister);
        return "reservaBabySister/form";
    }

    @GetMapping(value="/retrieve/{id}")
    public String retrieve(@PathVariable(value="id") Integer id, Model model) {
        ReservaBabySister reservaBabySister = service.findById(id);
        model.addAttribute("reservaBabySister",reservaBabySister);
        return "reservaBabySister/card";
    }

    @GetMapping(value="/update/{id}")
    public String update(@PathVariable(value="id") Integer id, Model model) {
        ReservaBabySister reservaBabySister = service.findById(id);
        model.addAttribute("reservaBabySister",reservaBabySister);
        return "reservaBabySister/form";
    }

    @GetMapping(value="/delete{id}")
    public String delete(@PathVariable(value="id") Integer id, Model model) {
        try {
            service.delete(id);
        }
        catch(Exception ex) {
            model.addAttribute("error",ex.toString());
        }
        return "redirect:reservaBabySister/list";
    }

    @GetMapping(value="/list")
    public String list(Model model) {
        List<ReservaBabySister> reservasBabySister=service.findAll();
        model.addAttribute("reservasBabySister",reservasBabySister);
        return "reservaBabySister/list";
    }

    @PostMapping(value="/save")
    public String save(ReservaBabySister reservaBabySister,Model model) {
        try {
            service.save(reservaBabySister);
        }
        catch(Exception ex){
            model.addAttribute("error",ex.toString());
        }
        return "redirect:/reservaBabySister/list";
    }

}
