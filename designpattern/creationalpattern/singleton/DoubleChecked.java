package designpattern.creationalpattern.singleton;

public class DoubleChecked {
    private volatile static DoubleChecked instance;

    private DoubleChecked() {}

    public static DoubleChecked getInstance() {
        if (instance == null) {
            synchronized (DoubleChecked.class) {
                if (instance == null) {
                    instance = new DoubleChecked();
                }
            }
        }
        return instance;
    }
}
