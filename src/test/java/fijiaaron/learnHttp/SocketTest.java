package fijiaaron.learnHttp;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.junit.Test;

public class SocketTest {

    String hostname = "example.com";
    int port = 80;

    @Test
    public void testSocketConnect() throws IOException {
        Socket socket = new Socket();
        InetSocketAddress address = new InetSocketAddress(hostname, port);
        socket.connect(address);

        assertTrue(socket.isConnected());

        socket.close();

        assertTrue(socket.isClosed());
    }

    @Test
    public void testSocketConnection() throws IOException {
        SocketConnection connection = new SocketConnection();
        connection.connect(hostname, port);
        assertTrue(connection.socket.isConnected());
    }
}
