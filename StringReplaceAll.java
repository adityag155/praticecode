class StringReplaceAll
{
public static void main(String args[])
{
String str1="CPC";
String str2="CPC";
String str3="DPC";
String str4="Hello";
String str5="India is my country. India is great nation";

System.out.println(str5.replaceAll("India","Bharat"));
System.out.println(str4.replaceAll("Hello","Heya:)"));
}
}

/*
O/P:
Bharat is my country. Bharat is great nation
Heya:)
*/