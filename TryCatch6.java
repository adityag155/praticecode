package adiiapplication;

public class TryCatch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int result=divide(10,2);
			System.out.println("result:"+result);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cant divided by zero");
		}
	}

	public static int divide(int a, int b)
	{
		return a/b;
	}
}

/*
O/P:
result:5
*/