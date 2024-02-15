import java.io.*;
class ReadngFle
{
public static void main(String args[])throws IOException
{
FileInputStream fis=null;

try
{
fis=new FileInputStream("India.txt");
}
catch(FileNotFoundException fe)
{
System.out.println("Invalid File Name");
System.exit(0);
}

int i=0;
char ch;

while(i!=-1)
{
i=fis.read();
ch=(char)i;
if(i!=1)
System.out.println(ch);
}
}
}