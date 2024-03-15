import java.io.*;
import java.net.*;

class MyClient1
{
public static void main(String args[])
{
try
{
Socket s=new Socket("localhost", 15);

//Sending data to server
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter data to be sent to server");
String data=dis.readLine();
byte arr[]=data.getBytes();

OutputStream os=s.getOutputStream();
os.write(arr);

//closing all objects
os.close();
s.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}