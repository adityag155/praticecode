import java.io.*;

class RdngWrtngDemo
{
public static void main(String args[])throws IOException 
{
DataInputStream dis=new DataInputStream(System.in);

System.out.println("Enter file name you want to write");
String fileWrite=dis.readLine();

System.out.println("Enter first line data to be written to that file");
String data1=dis.readLine();

System.out.println("Enter second line data to be written to that file");
String data2=dis.readLine();

FileOutputStream fos=null;

try
{
fos=new FileOutputStream(fileWrite);
}
catch(FileNotFoundException fe)
{
System.out.println("Invalid file name");
System.exit(0);
}

String data=data1+"\n"+data2;
byte arr[]=data.getBytes();
fos.write(arr);

fos.close();
}
}

/*
O/P
Hello
India
*/