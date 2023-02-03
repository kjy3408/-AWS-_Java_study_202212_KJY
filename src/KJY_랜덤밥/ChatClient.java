package KJY_랜덤밥;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 5000);
      System.out.println("Connected to server");

      InputStream input = socket.getInputStream();
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));

      OutputStream output = socket.getOutputStream();
      PrintWriter writer = new PrintWriter(output, true);

      Scanner keyboard = new Scanner(System.in);
      String message;

      do {
        System.out.print("Enter a message: ");
        message = keyboard.nextLine();
        writer.println(message);

        message = reader.readLine();
        System.out.println("Received from server: " + message);
      } while (!message.equals("bye"));

      socket.close();
    } catch (IOException e) {
      System.out.println("Error: " + e);
    }
  }
}