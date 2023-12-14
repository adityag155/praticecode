package adiiapplication;

import java.util.*;
public class DemoWsitch {

		public static void main(String args[])
		{
			int day;
			String dayName;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter a number:");
			day=sc.nextInt();
			
			switch(day)
			{
			case 1:
				dayName="Monday";
				break;
			case 2:
				dayName="Tuesday";
				break;
			case 3:
				dayName="Wednesday";
				break;
			case 4:
				dayName="Thursday";
				break;
			case 5:
				dayName="Friday";
				break;
			case 6:
				dayName="Saturday";
				break;
			case 7:
				dayName="Sunday";
				break;
			default:
				dayName="Invalid day";
			}
			System.out.println("The day is:"+dayName);
			}
		}

/*
O/P:
Enter a number between 1 to 7:
7
The day is:Sunday
*/
