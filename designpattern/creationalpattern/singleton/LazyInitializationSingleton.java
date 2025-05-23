package designpattern.creationalpattern.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;
    // private constructor to prevent direct instantiation for outer classes
    private LazyInitializationSingleton() {

    }
    public static synchronized LazyInitializationSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }

}
