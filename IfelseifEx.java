package adiiapplication;
import java.util.*;
public class IfelseifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		num =sc.nextInt();
		
		
		if(num>0)
		{
			System.out.println("Positive Number");
		}
		else if(num<0)
		{
				System.out.println("Negative Number");
		}
		else
		{
				System.out.println("ZERO");
		}
			
	}

}

/*
O/P:
Enter the number:
13
Positive Number
*/