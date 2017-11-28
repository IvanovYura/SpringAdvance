package ru.epam.spring.hometask.repository;

import ru.epam.spring.hometask.domain.DomainObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class MapBasedIdentityRepository<TEntity extends DomainObject> {

    private Map<Long, TEntity> map = new HashMap<>(); // List is more convenient

    private final AtomicLong maxId = new AtomicLong();

    MapBasedIdentityRepository(Collection<TEntity> collection) {
        for (TEntity entity : collection) {
            map.put(maxId.getAndIncrement(), entity);
        }
    }

    public void add(TEntity entity) {
        map.put(maxId.getAndIncrement(), entity);
    }

    public Map<Long, TEntity> getMap() {
        return this.map;
    }
}
