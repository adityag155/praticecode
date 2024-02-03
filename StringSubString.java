class StringSubString {
    public static void main(String args[]) {
        String str1 = "CPC";
        String str2 = "CPC";
        String str3 = "DPC";
        String str4 = "Hello";
        String str5 = "India is my Country. India is a great nation";

	System.out.println(str1.substring(1,2));
        System.out.println(str4.substring(1,4));
	System.out.println(str5.substring(1,7));
    }
}

/*
O/P:
P
ell
ndia i
*/