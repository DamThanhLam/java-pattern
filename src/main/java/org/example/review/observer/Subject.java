package org.example.review.observer;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObserver();
    public Object getUpdate(Observer observer);

}
