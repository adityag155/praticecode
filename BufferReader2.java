import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class BufferReader2
{
   public static void main(String args[]) throws IOException
 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter data. Enter 'S' to stop");
        int i = 0;
        char ch = ' ';

        while (ch != 'S')
 {
            i = br.read();  
            ch = (char) i;

            if (ch != 'S')
                System.out.println(ch);
        }       
    }
}

/*
O/P:
Enter data. Enter 'S' to stop
Hello How are youS
H
e
l
l
o

H
o
w

a
r
e

y
o
u
*/