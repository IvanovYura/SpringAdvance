package ru.epam.spring.hometask.service;

import ru.epam.spring.hometask.domain.DomainObject;
import ru.epam.spring.hometask.repository.MapBasedIdentityRepository;

public abstract class RepositoryBasedDomainObjectService<TEntity extends DomainObject> {

    protected MapBasedIdentityRepository<TEntity> repository;

    protected RepositoryBasedDomainObjectService(MapBasedIdentityRepository<TEntity> repository) {
        this.repository = repository;
    }

}
