package ru.epam.spring.hometask.repository;

import ru.epam.spring.hometask.domain.Auditorium;

import java.util.Collection;

public class AuditoriumRepository extends MapBasedIdentityRepository<Auditorium> {

    AuditoriumRepository(Collection<Auditorium> auditoriums) {
        super(auditoriums);
    }
}
