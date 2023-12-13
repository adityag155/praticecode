package adiiapplication;

public class IfelseifExmpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int weekDays=3;
		
		if(weekDays>=1 && weekDays<=5)
		{
			System.out.println("Its week Day");
		}
		else if(weekDays==6 || weekDays==7)
		{
			System.out.println("Its a Weekend");
		}
		else
		{
			System.out.println("You enter wrong details");
		}
	}

}

/*
O/P:
Its week Day
*/