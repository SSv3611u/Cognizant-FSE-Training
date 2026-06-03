import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter serverOutput = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                System.out.print("Client: ");
                String message = keyboard.readLine();
                serverOutput.println(message);

                if ("bye".equalsIgnoreCase(message)) {
                    break;
                }

                System.out.println("Server: " + serverInput.readLine());
            }
        } catch (IOException ex) {
            System.out.println("Client error: " + ex.getMessage());
        }
    }
}
