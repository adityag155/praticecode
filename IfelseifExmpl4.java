package adiiapplication;
import java.util.*;
public class IfelseifExmpl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1;
int num2;

Scanner sc=new Scanner(System.in);

System.out.print("Enter the first number: ");
num1 = sc.nextInt();

System.out.print("Enter the second number: ");
num2 = sc.nextInt();

if(num1>num2)
{
	System.out.println(num1+"is greater than"+num2);
}
else if(num1<num2)
{
	System.out.println(num1+"is less than"+num2);
}
else {
	System.out.println(num1+"both number are equal"+num2);
}sc.close();
}
}

/*
 * O/P:
 * Enter the first number: 20
Enter the second number: 30
20is less than30
*/
