package observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 150.00);
        Stock googleStock = new Stock("Google", 2800.00);
        
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");
        
        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);
        googleStock.addObserver(investor1);
        
        System.out.println("\n--- Updating Stock Prices ---");
        appleStock.setPrice(155.00);
        googleStock.setPrice(2900.00);
    }
}
