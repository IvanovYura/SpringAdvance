package ru.epam.spring.hometask.controller.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.epam.spring.hometask.common.SpringException;

@Controller
public class BaseController {

    @RequestMapping("/")
    public String getHomePage() {
        return "index";
    }

    @ExceptionHandler(SpringException.class)
    public String handleError(ModelMap model, SpringException exception) {
        model.addAttribute("exception", exception);
        return "exception";
    }
}
