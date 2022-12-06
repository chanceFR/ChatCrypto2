import java.io.IOException;
import java.net.Socket;

public class Main {

    public Main(){

    }

    public static void main(String[] args) {


        try {
            serverSocket = new ServerSoket(4444);
        } catch (IOException e) {
            System.out.println("Could not listen on port 4444");
            System.exit(-1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.out.println("Accept failed on port 4444");
            System.exit(-1);
        }
    }
}