package adiiapplication;

public class TryCatch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try 
		{
			System.out.println("Start of outer try");
		try
		{
			System.out.println("Start of inner try");
			int m=100, n=Integer.parseInt(args[0]);
			int k=m/n;
			System.out.println("K="+k);
			System.out.println("End of inner try");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Cant divided by zero");
		}
		System.out.println("End of outer try");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Outer catch");
		}
		
	}

}

/*
O/P:
Start of outer try
Start of inner try
Outer catch
*/