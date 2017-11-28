package ru.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.epam.spring.hometask.common.SpringException;
import ru.epam.spring.hometask.controller.base.BaseController;
import ru.epam.spring.hometask.service.BookingService;

import java.time.LocalDate;
@Controller
public class TicketsController extends BaseController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping("/tickets")
    public String getTickets(ModelMap model) {
        model.addAttribute("tickets", bookingService.getTickets());
        return "tickets";
    }

    @RequestMapping("/ticket/getByNameAndDate")
    public String getUserByEmail(
            @RequestParam("eventName") String eventName,
            @RequestParam("dateTime") String dateTime,
            ModelMap model) {

        if (eventName.isEmpty() || dateTime.isEmpty()) {
            throw  new SpringException("33", "event name or date is missing");
        }

        model.addAttribute("ticket", bookingService.getTicketPrice(eventName, LocalDate.parse(dateTime)));
        return "ticket";
    }
}
