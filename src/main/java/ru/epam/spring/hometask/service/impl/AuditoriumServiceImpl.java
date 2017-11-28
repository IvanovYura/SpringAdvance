package ru.epam.spring.hometask.service.impl;

import ru.epam.spring.hometask.domain.Auditorium;
import ru.epam.spring.hometask.repository.MapBasedIdentityRepository;
import ru.epam.spring.hometask.service.AuditoriumService;
import ru.epam.spring.hometask.service.RepositoryBasedDomainObjectService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AuditoriumServiceImpl extends RepositoryBasedDomainObjectService<Auditorium> implements AuditoriumService {

    protected AuditoriumServiceImpl(MapBasedIdentityRepository<Auditorium> repository) {
        super(repository);
    }

    @Override
    public List<Auditorium> getAuditoriums() {
        List<Auditorium> auditoriums = new ArrayList<>();
        for (Map.Entry<Long, Auditorium> entry : repository.getMap().entrySet()) {
            auditoriums.add(entry.getValue());
        }
        return auditoriums;
    }
}
