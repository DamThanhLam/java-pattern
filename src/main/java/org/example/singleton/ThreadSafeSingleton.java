package org.example.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private static String name = "lam";
    private ThreadSafeSingleton(){}
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public void setName(String name) {
        ThreadSafeSingleton.name = name;
    }

    public synchronized String getName() {
        return name;
    }

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
