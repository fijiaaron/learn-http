# learn-http

###*A tutorial and source code for learning HTTP.*

As a tester testing web applications and services, it's important to understand HTTP.

HTTP is the protocol used by browsers and mobile apps to communicate with a server.  It is also used to get data via web services.  HTTP was designed to be simple enough to use that anyone could create a server or client.  So that's what we're going to do.

In order to learn about the nuts and bolts of HTTP, we will create a library that accesses web resources using raw sockets.

My example uses Java, but you should be able to follow along in your language of choice.  If you really want, I'd be happy to port it to C, C++, C#, Ruby, Python, PHP, or Node.js for $1 each.

To start off, let's create a socket connection.

```java
Socket socket = new Socket();
InetSocketAddress address = new InetSocketAddress(hostname, port);
socket.connect(address);
socket.close()
```

see [src/main/test/SocketTest.java](https://github.com/fijiaaron/learn-http/blob/master/src/test/java/fijiaaron/learnHttp/SocketTest.java)





