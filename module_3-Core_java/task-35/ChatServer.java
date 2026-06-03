import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            try (Socket client = serverSocket.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
                 PrintWriter output = new PrintWriter(client.getOutputStream(), true);
                 BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Client connected.");
                String clientMessage;

                while ((clientMessage = input.readLine()) != null) {
                    System.out.println("Client: " + clientMessage);
                    if ("bye".equalsIgnoreCase(clientMessage)) {
                        break;
                    }

                    System.out.print("Server: ");
                    output.println(keyboard.readLine());
                }
            }
        } catch (IOException ex) {
            System.out.println("Server error: " + ex.getMessage());
        }
    }
}
