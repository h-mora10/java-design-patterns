package behavioral.state.solved;

public class ClosedTCPConnectionState implements TCPConnectionState {

    private TCPConnection connection;

    public ClosedTCPConnectionState(TCPConnection connection) {
        this.connection = connection;
    }

    @Override
    public void open() {
        connection.setState(new OpenTCPConnectionState(connection));
        System.out.println("Opening connection");
    }

    @Override
    public void close() {
        System.out.println("Connection already closed");
    }

    @Override
    public void acknowledge() throws Exception {
        throw new Exception("Invalid connection usage");
    }
}
