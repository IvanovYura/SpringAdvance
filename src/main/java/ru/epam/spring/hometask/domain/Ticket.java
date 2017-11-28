package ru.epam.spring.hometask.domain;

import java.time.LocalDate;

public class Ticket extends DomainObject {

    private User user;
    private Event event;
    private LocalDate dateTime;
    private Auditorium auditorium;
    private Long seat;

    Ticket(User user, Event event, LocalDate dateTime, Auditorium auditorium, long seat) {
        this.user = user;
        this.event = event;
        this.dateTime = dateTime;
        this.seat = seat;
        this.auditorium = auditorium;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public void setSeat(Long seat) {
        this.seat = seat;
    }

    public User getUser() {
        return this.user;
    }

    public Event getEvent() {
        return this.event;
    }

    public LocalDate getDateTime() {
        return this.dateTime;
    }

    public Long getSeat() {
        return this.seat;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Auditorium getAuditorium() {
        return this.auditorium;
    }
}
