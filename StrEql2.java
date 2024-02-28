class StrEql2
{
public static void main(String args[])
{
String str1=new String("CPC");
String str2=new String("CPC");
String str3=new String("CPC");

System.out.println(str1==str2);				//f
System.out.println(str1==str3);				//f

//System.out.println(str1.equals(str3)); 		//Then it will be true

} 
}

/*
O/P:
false
false
*/