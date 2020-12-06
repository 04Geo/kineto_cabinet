package org.sda.controller;

import org.sda.entities.Pacient;
import org.sda.service.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pacient")
public class PacientController {
    @Autowired
    private PacientService pacientService;

    @GetMapping("/all")
    public String getPacienti(Model model) {
        List<Pacient> allPacienti = pacientService.findAll();

        model.addAttribute("employees", allPacienti);
        return "pacient-list";

    }

    @PostMapping("/create")
    public String createPacient(@ModelAttribute Pacient pacient) {

        try {
            pacientService.save(pacient);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/pacient/all";
    }

    @RequestMapping("/create")
    public String goToCreate(Model model) {
        model.addAttribute(new Pacient());
        return "pacient-create";
    }

}
