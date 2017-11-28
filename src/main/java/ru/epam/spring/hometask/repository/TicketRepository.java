package ru.epam.spring.hometask.repository;

import ru.epam.spring.hometask.domain.Ticket;

import java.util.Collection;

public class TicketRepository extends MapBasedIdentityRepository<Ticket> {

    TicketRepository(Collection<Ticket> tickets) {
        super(tickets);
    }
}
