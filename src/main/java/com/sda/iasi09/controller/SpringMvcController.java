package com.sda.iasi09.controller;

import com.sda.iasi09.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringMvcController {
    private PersonService personService;

    @Autowired
    public SpringMvcController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/home")
    public String iDontCare(Model model) {
        model.addAttribute("personList", personService.findRandomPersonList());
        return "home";
    }
}
