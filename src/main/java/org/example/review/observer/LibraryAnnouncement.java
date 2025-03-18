package org.example.review.observer;

import org.example.review.enums.TypeSubject;
import org.example.review.model.Message;

import java.util.ArrayList;
import java.util.List;

public class LibraryAnnouncement implements Subject {
    private Message message;
    private boolean changed;
    private List<Observer> observers;
    public LibraryAnnouncement() {
        observers = new ArrayList<>();
    }
    public void postMessage(Message message) {
        changed = false;
        this.message = message;
        notifyObserver();
    }
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if(!changed) {
            if(this.message.getType().equals(TypeSubject.BOOKNEW)){
                observers.forEach(Observer::update);

            }else if(this.message.getType().equals(TypeSubject.EXPIRED)){
//                observers.forEach(item -> {
//                    LibraryAnnouncementSubscriber subscriber = (LibraryAnnouncementSubscriber) item;
//                    if(subscriber.getUser().getBooksRent())
//                });
                observers.forEach(Observer::update);

            }
            changed = true;
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return message;
    }
}
