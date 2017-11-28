package ru.epam.spring.hometask.repository;

import ru.epam.spring.hometask.domain.Event;

import java.util.Collection;

public class EventRepository extends MapBasedIdentityRepository<Event> {

    protected EventRepository(Collection<Event> events) {
        super(events);
    }
}
