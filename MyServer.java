import java.io.*;
import java.net.*;

class MyServer
{
public static void main(String args[])
{
try
{
ServerSocket ss=new ServerSocket(15);
Socket s=ss.accept();

//Reading data from client
InputStream is=s.getInputStream();

int i=o;
char ch=' ';

while(i!=-1)
{
i=is.read();
ch=(char)i;
if(i!=-1) System.out.println(ch);

//closing all objects
is.close();
s.close();
ss.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}