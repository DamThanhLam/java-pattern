package org.example.singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EagerInitializedSingleton eagerInitializedSingleton;
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();

        // Tạo 2 thread để kiểm tra singleton
        Thread thread1 = new Thread(() -> {
            ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
            System.out.println("Thread 1: " + instance1);
            instance1.setName("aa");
            System.out.println("Thread 1: " + instance1);
            System.out.println("Thread 1: " + instance1.getName());
        });

        Thread thread2 = new Thread(() -> {
            ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();
            instance2.setName("ll");
            System.out.println("Thread 2: " + instance2);
            System.out.println("Thread 2: " + instance2.getName());

        });

        // Bắt đầu thực thi các thread
        thread1.start();
        thread2.start();

        // Đảm bảo main thread chờ các thread con kết thúc trước khi kết thúc
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Kiểm tra lại instance trong main thread
        System.out.println("Main thread: " + ThreadSafeSingleton.getInstance());
    }
}