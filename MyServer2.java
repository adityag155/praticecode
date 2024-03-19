import java.io.*;
import java.net.*;

class MyServer2 {
    public static void main(String args[]) {
        while (true) {
            try {
                ServerSocket ss = new ServerSocket(15);
                Socket s = ss.accept();

                // Reading data from client
                InputStream is = s.getInputStream();
                ObjectInputStream ois = new ObjectInputStream(is);
                String data = (String) ois.readObject();
                System.out.println("Client says:" + data);

                // Sending data to client
                DataInputStream dis = new DataInputStream(System.in);
                System.out.println("Enter data to be sent to client");
                data = dis.readLine();

		OutputStream os=s.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(os);		
		oos.writeObject(data);

                // Closing all objects
                ois.close();
                is.close();
                s.close();
                ss.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
