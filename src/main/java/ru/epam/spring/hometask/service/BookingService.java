package ru.epam.spring.hometask.service;

import ru.epam.spring.hometask.domain.Ticket;
import ru.epam.spring.hometask.domain.User;

import java.awt.Event;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface BookingService {

    List<Ticket> getTickets();

    double getTicketPrice(String eventName, LocalDate dateTime);

    void bookTickets(Set<Ticket> tickets);
}
