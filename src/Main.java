import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public Main(){

    }

        public static void main(String[] args) {


            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(4444);
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

            try {
                Socket echoSocket = new Socket(nom machine distante, numéro de port distant);
                PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(newInputStreamReader(echoSocket.getInputStream()));
            } catch (
                    UnknownHostException e) {
                System.out.println(" Destination unknown ");
                System.exit(-1);
            } catch (IOException e) {
                System.out.println(" now to investigate this IO issue ");
                System.exit(-1);
            }
        }
}