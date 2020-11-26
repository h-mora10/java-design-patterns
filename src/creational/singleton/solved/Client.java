package creational.singleton.solved;

public class Client {

    public static void main(String[] args) {

        Preferences.getInstance().helloSingleton();

        // Cannot assign anything to the instance
        // Preferences.getInstance() =

        MyPreferences.getInstance().helloSingleton();
    }
}
