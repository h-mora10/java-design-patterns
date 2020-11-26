package creational.singleton.problem;

public class Client {

    public static void main(String[] args) {

        System.out.println(Preferences.globalPreferences.getPreference());

        Preferences secondPreference = new Preferences("Second preference");

        Preferences.globalPreferences = secondPreference;

        System.out.println(Preferences.globalPreferences.getPreference());
    }
}
