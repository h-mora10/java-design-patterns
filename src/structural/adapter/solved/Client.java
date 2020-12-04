package structural.adapter.solved;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        LegacyVehicle legacyVehicle = new FerrariTestarossa();
        LegacyVehicleAdapter adapter = new LegacyVehicleAdapterImpl(legacyVehicle);

        client.displaySpeed(adapter);
    }

    private void displaySpeed(LegacyVehicleAdapter adapter) {
        System.out.println("Speed: " + adapter.getSpeed() + " Km/h");
    }

}
