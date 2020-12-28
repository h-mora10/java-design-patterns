package behavioral.state.solved;

public interface TCPConnectionState {

    void open();

    void close();

    void acknowledge() throws Exception;
}
