//BufferedReader class

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class BufferReader
{
   public static void main(String args[]) throws IOException
 {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter data. Enter 'S' to stop");
        int i = 0;
        char ch = ' ';

        while (ch != 'S')
 {
            i = br.read();  // Corrected method name
            ch = (char) i;

            if (ch != 'S')
                System.out.println(ch);
        }

       
    }
}
/*
O/P:
Enter data. Enter 'S' to stop
India is my Country S
I
n
d
i
a

i
s

m
y

C
o
u
n
t
r
y
*/