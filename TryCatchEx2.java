class TryCatchEx2{
public static void main(String args[]){

try
{
int m=100, n=Integer.parseInt(args[0]);
int k=m/n;
System.out.println("K="+k);
}

catch(ArithmeticException e)
{
System.out.println("cant divide by zero");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("You not enter input");
}

catch(NumberFormatException e)
{
System.out.println("Invalid input");
}
System.out.println("After catch");
}
}

/*
O/P:

1)C:\Aditya>java TryCatchEx2 0
cant divide by zero
After catch

2)Aditya>java TryCatchEx2
You not enter input
After catch

3)C:\Aditya>java TryCatchEx2 abc
Invalid input
After catch

4)C:\Aditya>java TryCatchEx2 2
K=50
After catch
*/