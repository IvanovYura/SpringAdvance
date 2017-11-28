package ru.epam.spring.hometask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ru.epam.spring.hometask.common.SpringException;
import ru.epam.spring.hometask.controller.base.BaseController;
import ru.epam.spring.hometask.domain.Event;
import ru.epam.spring.hometask.service.EventService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Controller
public class EventsController extends BaseController {

    @Autowired
    private EventService eventService;

    @RequestMapping("/events")
    public String getEvents(ModelMap model) {
        model.addAttribute("events", eventService.getEvents());
        return "events";
    }

    @RequestMapping(value = "/uploadEvents", method = RequestMethod.POST)
    public String uploadEvents(@RequestParam("files") MultipartFile[] files, ModelMap modelMap) {

        for (MultipartFile file : files) {
            try {
                String content = new String(file.getBytes(), "UTF-8");
                String[] items = content.split(";");
                String eventName = items[0];
                double price = Double.valueOf(items[1]);
                Set<String> dates = new TreeSet<>();
                Collections.addAll(dates, items[2].split(","));
                this.addEvent(eventName, price, dates);

            } catch (IOException e) {
                throw new SpringException("66", "there is a problem to read uploaded TXT file");
            }
        }
        return "redirect:/events";
    }

    private void addEvent(String name, double price, Set<String> dates) {
        List<Event> events = new ArrayList<>();
        Event event = new Event();
        event.setName(name);
        event.setBasePrice(price);
        event.setAirDates(dates);
        events.add(event);
        eventService.addEvents(events);
    }
}
