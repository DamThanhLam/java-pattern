package observer;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String stockName, double price);
}

// Concrete Observer (Investor)
class Investor implements Observer {
    private String name;
    
    public Investor(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String stockName, double price) {
        System.out.println("Investor " + name + " notified: " + stockName + " price changed to $" + price);
    }
}
