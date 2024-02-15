//for reading file you have to 1st creat 1st file in same folder then put the name of file

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

/*
O/P:
I
n
d
i
a

i
s




M
y

C
o
u
n
t
r
y
?
*/
