public class TryCatch3
{

    public static void main(String[] args)
 {

        try
 {
            // Code that may throw an exception

            int result = divideNumbers(10, 0);

            System.out.println("Result: " + result);
 // This line won't be executed if an exception occurs

        }

 catch (ArithmeticException e)
 {

            // Handling the specific exception (ArithmeticException in this case)
            System.out.println("An error occurred: " + e.getMessage());

        }

    }


    public static int divideNumbers(int dividend, int divisor)
 {

        return dividend / divisor;
 // This can throw an ArithmeticException if divisor is 0
 
   }

}

/*
O/P:
An error occurred: / by zero
*/