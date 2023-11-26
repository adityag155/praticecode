//Write a method which accepts a number & prints whether that number is prime or not

import java.util.*;
class First
{
void checkPrime(int num)
{
boolean flag=true;
for(int i=2;i<=num/2;i++)
{
if(num%i==0)
{
flag=false;
break;
}
}
if (flag==true)
System.out.println("The number"+num+"is prime");
else
System.out.println("The number"+num+"is not prime");
}
}
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();

First f=new First();
f.checkPrime(num);
}
}