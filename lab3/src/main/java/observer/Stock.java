package observer;

import java.util.ArrayList;
import java.util.List;

class Stock implements StockSubject {
    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
    
    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(name, price);
        }
    }
}
