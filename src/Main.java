import java.io.IOException;
import java.net.*;

public class Main {

    public static void main (String[] args) {
        EchoServer server = new EchoServer();
        EchoClient client = new EchoClient();

        server.start();

        String echo = client.sendEcho("hello server");
        System.out.println("Sending Echo:" + echo);

    }

}
