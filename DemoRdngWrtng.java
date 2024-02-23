import java.io.*;

class DemoRdngWrtng
{
public static void main(String args[])throws IOException
{
DataInputStream dis=new DataInputStream(System.in);

System.out.println("Enter File name you want to write");
String fileWrite=dis.readLine();

System.out.println("Enter data to be written to that File");
String data=dis.readLine();

FileOutputStream fos=null;
try
{
fos=new FileOutputStream(fileWrite);
}
catch(FileNotFoundException fe)
{
System.out.println("Invalid File Name");
}
System.exit(0);


byte arr[]=data.getBytes();
fos.write(arr);

fos.close();
}
}