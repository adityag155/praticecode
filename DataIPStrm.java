import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DataIPStrm {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first no");
        int fno = Integer.parseInt(br.readLine());

        System.out.println("Enter second no");
        int sno = Integer.parseInt(br.readLine());

        int sum = fno + sno;
        System.out.println("The sum of " + fno + " and " + sno + " is " + sum);
    }
}
/*
O/P:
Enter first no
20
Enter second no
30
The sum of 20 and 30 is 50
*/