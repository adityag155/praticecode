/*
##If the result is 0, it means both strings are equal.
##If the result is negative, it means the calling string (str1  ) is  smaller than the argument string (str2 in this case).
##If the result is positive, it means the calling string (str1) is greater than the argument string (str2).
*/

class StringCompareTo
{
public static void main(String args[])
{
String str1="CPC";
String str2="CPC";
String str3="DPC";
String str4="Hello";
String str5="Indaia is my country. India is great nation";

System.out.println(str1.compareTo(str2));
System.out.println(str1.compareTo(str3));
System.out.println(str1.compareTo(str4));
System.out.println(str3.compareTo(str1));
}
}

/*
O/P:
0
-1
-5
1
*/