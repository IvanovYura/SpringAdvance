package ru.epam.spring.hometask.domain;

public abstract class DomainObject {

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
