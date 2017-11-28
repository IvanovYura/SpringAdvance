package ru.epam.spring.hometask.controller.pdf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.epam.spring.hometask.service.BookingService;

@Controller
public class PDFController {

    @Autowired
    private BookingService bookingService;

    @RequestMapping("/tickets/pdf")
    public String getUserByEmail(ModelMap model) {
        model.addAttribute("tickets", bookingService.getTickets());
        return "PdfTicketsView";
    }

}
