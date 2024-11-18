package SRC.main.model;


import java.util.ArrayList;
import java.util.List;

import SRC.main.observer.Observer;
import SRC.main.observer.Subject;

public abstract class Transport implements Subject {
    public String name;
    public String flexibility;
    public String paymentType;
    private final List<Observer> observers = new ArrayList<>();

    public Transport(String name, String flexibility, String paymentType) {
        this.name = name;
        this.flexibility = flexibility;
        this.paymentType = paymentType;
    }

    public String getDetails() {
        return "Transport Type: " + name + "\nFlexibility: " + flexibility + "\nPayment: " + paymentType;
    }


    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }


    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
