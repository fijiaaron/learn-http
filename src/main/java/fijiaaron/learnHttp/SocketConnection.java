package fijiaaron.learnHttp;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketConnection {
    Socket socket;

    public SocketConnection() {
        socket = new Socket();
    }

    public void connect(String hostname, int port) throws IOException {
        InetSocketAddress address = new InetSocketAddress(hostname, port);
        socket.connect(address);
    }
}
