package creational.abstractfactory.current;

public class Client {

    public static void initGUI(ScrollBar scrollBar, Window window) {
        System.out.println("Init theme with " + scrollBar.getClass().getName() + " and " + window.getClass().getName());
    }

    public static void main(String[] args) {

        ScrollBar scrollBar = new YellowThemeScrollBar();
        Window window = new YellowThemeWindow();

        initGUI(scrollBar, window);

        // different non-sense configuration could be made, since the themes are not really associated
        scrollBar = new YellowThemeScrollBar();
        window = new PinkThemeWindow();
        // it lets init unrelated components and they're exposed to the client
        initGUI(scrollBar, window);
    }
}
