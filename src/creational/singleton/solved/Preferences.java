package creational.singleton.solved;

public class Preferences {

    private static Preferences instance = null;

    //only this class or its subclasses can create new instances
    protected Preferences() {

    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new Preferences();
        }
    }

    public static Preferences getInstance() {
        if (instance == null) {
            createInstance();
        }

        return instance;
    }

    public void helloSingleton() {
        System.out.println("Hello! I'm a singleton");
    }
}
