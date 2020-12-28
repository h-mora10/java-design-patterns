package behavioral.state.current;

public class TCPConnection {

    private TCPConnectionState state = TCPConnectionState.CLOSED;

    public void open() {
        if (state == TCPConnectionState.OPEN) {
            System.out.println("Reinitializing connection");
        } else if (state == TCPConnectionState.CLOSED) {
            state = TCPConnectionState.OPEN;
            System.out.println("Opening connection");
        }
    }

    public void close() {
        if (state == TCPConnectionState.CLOSED) {
            System.out.println("Connection already closed");
        } else if (state == TCPConnectionState.OPEN) {
            state = TCPConnectionState.CLOSED;
            System.out.println("Closing connection");
        }
    }

    public void acknowledge() throws Exception {
        if (state == TCPConnectionState.CLOSED) {
            throw new Exception("Invalid connection usage");
        } else if (state == TCPConnectionState.OPEN) {
            System.out.println("Connection acknowledged");
        }
    }
}
