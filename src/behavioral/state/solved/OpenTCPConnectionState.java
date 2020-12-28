package behavioral.state.solved;

public class OpenTCPConnectionState implements TCPConnectionState {

    private TCPConnection connection;

    public OpenTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        System.out.println("Reinitializing connection");
    }

    @Override
    public void close() {
        connection.setState(new ClosedTCPConnectionState(connection));
        System.out.println("Closing connection");
    }

    @Override
    public void acknowledge() {
        System.out.println("Connection acknowledged");
    }
}
