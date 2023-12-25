package adiiapplication;

public class TryCatch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try 
{
	int m=100, n=Integer.parseInt(args[0]);
	int k=m/n;
	System.out.println("K="+k);
}

catch(ArithmeticException e)
{
	System.out.println("Cant divided by zero");
}

catch(ArrayIndexOutOfBoundsException ae)
{
	System.out.println("Invalid array Index");
}

catch(NumberFormatException e)
{
	System.out.println("Invalid Input");
}
System.out.println("After catch");
	}

}

/*
 * O/P:
 * Invalid array Index
After catch
*/
