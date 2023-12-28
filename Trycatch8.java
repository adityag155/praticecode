class TryCatch5{
public static void main(String args[]){

try
{
int m=100, n=Integer.parseInt(args[0]);
int k=m/n;
System.out.println("K="+k);
}

catch(ArithmeticException e)
{         //This will be executed when we assign 0
System.out.println("Cant divided by zero");
}

catch(ArrayIndexOutOfBoundsException e)
{     //This will be executed when we not assign any input
System.out.println("Invalid array index");
}

catch(NumberFormatException e)
{     //This will be execute when we assign any character->abc
System.out.println("Invalid input");
}
System.out.println("After catch");
}
}

/*
O/P:
java TryCatch5 0
Can't divided by zero
After catch
*/
