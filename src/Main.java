import java.io.IOException;
import java.net.*;

public class Main {

    public static void main (String[] args) throws UnknownHostException {
        EchoServer server = new EchoServer(8888);
        EchoClient client = new EchoClient(InetAddress.getByName("localhost"), 8888);

        server.start();

        String echo = client.sendEcho("hello server");
        System.out.println("Sending Echo:" + echo);

    }

}
