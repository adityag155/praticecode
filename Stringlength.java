package adiiapplication;

public class Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="CPC";
		String str2="CPC";
		String str3="DPC";
		String str4="Hello";
		String str5="India is my country, India is Great Nation";
		
		System.out.println(str1.length());
		System.out.println(str4.length());
		System.out.println(str5.length());
		
		System.out.println(str4.charAt(1));		//e
		System.out.println(str5.charAt(21));	//I
		
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1.equals(str4));	//false
		
		System.out.println(str1.compareTo(str3));	//-1
		System.out.println(str1.compareTo(str2));	//0
		System.out.println(str1.compareTo(str4));	//-5
		System.out.println(str3.compareTo(str1));	//1
		
		System.out.println(str5.toUpperCase());
		System.out.println(str4.toUpperCase());		//HELLO
		
		System.out.println(str1.toLowerCase());		//cpc
		System.out.println(str4.toLowerCase());		//hello
		
		System.out.println(str4.substring(1,4));	//ell
		System.out.println(str5.substring(5,25));	// is my country, Indi
		
		System.out.println(str4.replace('l','m'));	//Hemmo
		System.out.println(str1.replace('C','k'));	//kPk
		
		System.out.println(str5.replaceAll("India", "Bharat"));
		System.out.println(str4.replaceAll("Hello", "Heya:)"));
	
	}
}

/*
O/P:
3
5
42

e
I

true
false

-1
0
-5
1

INDIA IS MY COUNTRY, INDIA IS GREAT NATION
HELLO

cpc
hello

ell
 is my country, Indi

Hemmo
kPk

Bharat is my country, Bharat is Great Nation
Heya:)
*/