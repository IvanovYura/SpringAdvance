package ru.epam.spring.hometask.service;

import ru.epam.spring.hometask.domain.Event;

import java.util.List;

public interface EventService {

    List<Event> getEvents();

    void addEvents(List<Event> events);

}
