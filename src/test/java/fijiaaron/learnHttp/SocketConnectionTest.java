package fijiaaron.learnHttp;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SocketConnectionTest {

    SocketConnection connection = new SocketConnection();

    String hostname = "example.com";
    int port = 80;

    @Test
    public void should_connect_to_remote_host_via_socket() throws IOException {
        SocketConnection connection = new SocketConnection();

        connection.connect(hostname, port);
        assertTrue(connection.socket.isConnected());
    }

    @Test
    public void should_close_socket_connection() throws IOException {
        SocketConnection connection = new SocketConnection();

        connection.connect(hostname, port);
        connection.disconnect();
        assertTrue(connection.socket.isClosed());
    }
}
