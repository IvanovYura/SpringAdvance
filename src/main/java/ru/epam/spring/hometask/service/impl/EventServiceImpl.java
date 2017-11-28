package ru.epam.spring.hometask.service.impl;

import ru.epam.spring.hometask.domain.Event;
import ru.epam.spring.hometask.repository.MapBasedIdentityRepository;
import ru.epam.spring.hometask.service.EventService;
import ru.epam.spring.hometask.service.RepositoryBasedDomainObjectService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventServiceImpl extends RepositoryBasedDomainObjectService<Event> implements EventService {

    protected EventServiceImpl(MapBasedIdentityRepository<Event> repository) {
        super(repository);
    }

    @Override
    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        for (Map.Entry<Long, Event> entry : repository.getMap().entrySet()) {
            events.add(entry.getValue());
        }
        return events;
    }

    @Override
    public void addEvents(List<Event> events) {
        for (Event event : events) {
            repository.add(event);
        }
    }
}
