import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 15);

            // Sending data to server
            DataInputSTream dis=new DataInputStream(System.in);
            System.out.println("Enter data to be sent to the server");

            String data = dis.readLine();
            byte arr[]= data.getBytes();

            OutputStream os = new OutputStream();
            os.write(arr);

            os.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
