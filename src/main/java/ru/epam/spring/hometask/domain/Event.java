package ru.epam.spring.hometask.domain;

import java.util.Set;
import java.util.TreeSet;

public class Event extends DomainObject {

    private String name;
    private double basePrice;

    private Set<String> airDates = new TreeSet<>();

    public boolean addAirDateTime(String dateTime) {
        return this.airDates.add(dateTime);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public Set<String> getAirDates() {
        return this.airDates;
    }

    public void setAirDates(Set<String> airDates) {
        this.airDates = airDates;
    }
}
