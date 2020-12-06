package structural.bridge.solved;

public class Client {

    public static void main(String[] args) {

        // Creates a direct icon window
        IconWindow iconWindow = new IconWindow();
        iconWindow.setWindow(new DirectXWindow());
        iconWindow.drawIcon();

        // Creates a linux icon window
        iconWindow.setWindow(new LinuxWindow());
        iconWindow.drawIcon();
    }
}
