package ru.epam.spring.hometask.domain;

public class Auditorium extends DomainObject {

    private String name;

    private long numberOfSeats;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSeats(long numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return this.name;
    }

    public long getNumberOfSeats() {
        return this.numberOfSeats;
    }
}
