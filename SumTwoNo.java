import java.io.*;
class SumTwoNo
{
public static void main(String args[])throws IOException
{
DataInputStream dis=new DataInputStream(System.in);

System.out.println("Enter First no");
int fno=Integer.parseInt(dis.readLine());

System.out.println("Enter Second no");
int sno=Integer.parseInt(dis.readLine());

int sum=fno+sno;
System.out.println("The sum of"+fno+"and"+sno+"is"+sum);
}
}

/*
O/P:
The sum of20and30is50
*/