package adiiapplication;

public class TryCatch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int result=divide(10,0);
			System.out.println("Result:"+result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("cant divided by zero");
		}
	}
	public static int divide(int a, int b)
	{
		return a/b;
	}
}

/*
O/P:
cant divided by zero
*/