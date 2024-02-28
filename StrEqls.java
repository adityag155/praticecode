class StrEqls
{
public static void main(String args[])
{
String str1="CPC";
String str2="CPC";
String str3="CPC";


System.out.println(str1==str2);			//t
System.out.println(str1==str3);			//t

str1="Pune";
System.out.println(str1);
System.out.println(str2);
System.out.println(str3);

System.out.println(str1==str2);			//f

}
}

/*
O/P:
true
true
Pune
CPC
CPC
false
*/