package adiiapplication;

import java.util.*;
public class NestedIfExmpl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=25;
		char Gender='M';
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your age");
		age = sc.nextInt();
		
		System.out.println("Enter Gender as M or F");
		Gender=sc.next().charAt(0);;
		
		
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
			
			if(Gender=='M')
			{
				System.out.println("And you are Male voter");
		    }
		else if(Gender=='F')
		{
			System.out.println("And you are Female voter");
		}
		else
		{
			System.out.println("Gender not specified");
		}
	}
		else
	{
		System.out.println("You are not Eligible to vote");
	}
}
}

/*
 * O/P:
 * Enter Your age
23
Enter Gender as M or F
M
You are eligible to vote
And you are Male voter
*/
