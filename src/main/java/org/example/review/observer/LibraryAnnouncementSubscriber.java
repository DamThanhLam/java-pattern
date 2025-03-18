package org.example.review.observer;

import org.example.review.model.Message;
import org.example.review.model.User;

public class LibraryAnnouncementSubscriber implements Observer {
    private User user;
    private Subject topic;

    public LibraryAnnouncementSubscriber(User user, Subject topic) {
        this.user = user;
        this.topic = topic;
    }

    public Subject getTopic() {
        return topic;
    }

    public void setTopic(Subject topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void update() {
        Message message = (Message) this.topic.getUpdate(this);
        if(message != null) {
            System.out.println(message.toString());
        }else{
            System.out.println("no message");
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
