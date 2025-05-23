package designpattern.creationalpattern.singleton;

public class ThreadSafeLazySingleton {
    //single instance , initially full
    private static ThreadSafeLazySingleton instance;

    //private constructor to avoid client applications to use constructor
    private ThreadSafeLazySingleton() {

    }

    //thread safe
    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }
}
