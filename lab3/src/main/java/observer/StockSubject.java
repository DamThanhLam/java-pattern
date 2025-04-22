package observer;

interface StockSubject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}