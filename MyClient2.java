//Two way chat window


import java.io.*;
import java.net.*;

class MyClient2
{
public static void main(String args[])
{
while(true)
{
try
{
Socket s=new Socket("localhost", 15);

//sending data to server
DataInputStream dis=new DataInputStream(System.in);
System.out.println("Enter data to be sent to server");

String data=dis.readLine();

OutputStream os=s.getOutputStream();
ObjectOutputStream oos=new ObjectOutputStream(os);
oos.writeObject(data);

//Reading data from client
{
InputStream is=s.getInputStream();
ObjectInputStream ois=new ObjectInputStream(is);
data=(String)ois.readObject();
System.out.println("Server says:"+data);

//closing all objects
ois.close();
is.close();
oos.close();
s.close();
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}