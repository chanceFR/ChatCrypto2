import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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
    }
    try{
    	echoSocket = new Socket(nom machine distante, numéro de port distant) ;
    	out = new PrintWriter(echoSocket.getOutputStream(),true) ;
    	in = new BufferedReader(newInputStreamReader(echoSocket.getInputStream())) ;
    	}
    	catch(UnknownHostException e){
    	System.out.println(« Destination unknown ») ;
    	System.exit(-1) ;
    	}
    	catch(IOException e){
    	System.out.println(« now to investigate this IO issue ») ;
    	System.exit(-1) ;
    	}
}