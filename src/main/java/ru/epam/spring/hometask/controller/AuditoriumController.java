package ru.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.epam.spring.hometask.controller.base.BaseController;
import ru.epam.spring.hometask.service.AuditoriumService;

@Controller
public class AuditoriumController extends BaseController {

    @Autowired
    private AuditoriumService auditoriumService;

    @RequestMapping("/auditoriums")
    public String getAuditoriums(ModelMap model) {
        model.addAttribute("auditoriums", auditoriumService.getAuditoriums());
        return "auditoriums";
    }

}
