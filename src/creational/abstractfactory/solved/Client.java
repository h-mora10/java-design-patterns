package creational.abstractfactory.solved;

public class Client {

    public static void initGUI(WidgetFactory factory) {
        initGUI(factory.createScrollBar(), factory.createWindow());
    }

    public static void initGUI(ScrollBar scrollBar, Window window) {
        System.out.println("Init theme with " + scrollBar.getClass().getName() + " and " + window.getClass().getName());
    }

    public static void main(String[] args) {

        // With a few lines we have a full theme configured and centralized in the factory
        WidgetFactory factory = new PinkThemeWidgetFactory();
        initGUI(factory);

        factory = new YellowThemeWidgetFactory();
        initGUI(factory);
    }
}
