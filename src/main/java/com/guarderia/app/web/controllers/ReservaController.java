package com.guarderia.app.web.controllers;


import com.guarderia.app.web.models.entities.Reserva;
import com.guarderia.app.web.models.services.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value="/reserva")
public class ReservaController  {

    @Autowired
    private IReservaService service;

    @GetMapping(value="/create")
    public String create(Model model) {
        Reserva reserva =new Reserva();
        model.addAttribute("reserva",reserva);
        return "reserva/form";
    }

    @GetMapping(value="/retrieve/{id}")
    public String retrieve(@PathVariable(value="id") Integer id, Model model) {
        Reserva reserva = service.findById(id);
        model.addAttribute("reserva",reserva);
        return "reserva/card";
    }

    @GetMapping(value="/update/{id}")
    public String update(@PathVariable(value="id") Integer id, Model model) {
        Reserva reserva = service.findById(id);
        model.addAttribute("reserva",reserva);
        return "reserva/form";
    }

    @GetMapping(value="/delete{id}")
    public String delete(@PathVariable(value="id") Integer id, Model model) {
        try {
            service.delete(id);
        }
        catch(Exception ex) {
            model.addAttribute("error",ex.toString());
        }
        return "redirect:reserva/list";
    }

    @GetMapping(value="/list")
    public String list(Model model) {
        List<Reserva> reservas=service.findAll();
        model.addAttribute("reservas",reservas);
        return "reserva/list";
    }

    @PostMapping(value="/save")
    public String save(Reserva reserva,Model model) {
        try {
            service.save(reserva);
        }
        catch(Exception ex){
            model.addAttribute("error",ex.toString());
        }
        return "redirect:/reserva/list";
    }

}
