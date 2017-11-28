package ru.epam.spring.hometask.service.impl;

import ru.epam.spring.hometask.domain.Ticket;
import ru.epam.spring.hometask.repository.MapBasedIdentityRepository;
import ru.epam.spring.hometask.service.BookingService;
import ru.epam.spring.hometask.service.RepositoryBasedDomainObjectService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookingServiceImpl extends RepositoryBasedDomainObjectService<Ticket> implements BookingService {

    protected BookingServiceImpl(MapBasedIdentityRepository<Ticket> repository) {
        super(repository);
    }

    @Override
    public List<Ticket> getTickets() {
        List<Ticket> tickets = new ArrayList<>();

        for (Map.Entry<Long, Ticket> entry : repository.getMap().entrySet()) {
            tickets.add(entry.getValue());
        }
        return tickets;
    }

    @Override
    public double getTicketPrice(String eventName, LocalDate dateTime) {
        for (Map.Entry<Long, Ticket> entry : repository.getMap().entrySet()) {
            if (entry.getValue().getEvent().getName().equals(eventName) && entry.getValue().getDateTime().equals(dateTime)) {
                return entry.getValue().getEvent().getBasePrice();
            }
        }
        return 0;
    }

    @Override
    public void bookTickets(Set<Ticket> tickets) {

    }
}
