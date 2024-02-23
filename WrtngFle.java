import java.io.*;

class WrtngFle
{
public static void main(String args[])throws IOException
{
DataInputStream dis=new DataInputStream(System.in);

System.out.println("Enter file name you want to read");
String fileRead=dis.readLine();

System.out.println("Enter the file name you want to write");
String fileWrite=dis.readLine();

FileInputStream fis=null;
FileOutputStream fos=null;

try
{
fis=new FileInputStream(fileRead);
}
catch(FileNotFoundException fe)
{
System.out.println("Invalid file name");
System.exit(0);
}

try
{
fos=new FileOutputStream(fileWrite);
}
catch(FileNotFoundException fe)
{
System.out.println("Inavlid file name");
System.exit(0);
}

int i=0;
char ch;

while(i!=-1)
{
i=fis.read();
ch=(char)i;
if(i!=1)
{
fos.write(i);
System.out.println(ch);
}
}

fis.close();
fos.close();
}
}