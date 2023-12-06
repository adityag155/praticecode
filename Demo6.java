class First
{
static int a=100;
int b=200;

First()
{
System.out.println("Constructor in First class");
}
static void meth()
{
System.out.println("This is static method");
}
{
System.out.println("this is instance block in first class");
}
}

class Demo6
{
static 
{
System.out.println("This is static block in first class");
}
public static void main(String args[])
{
System.out.println("Hello");

System.out.println(First.a);
First.meth();

First f1=new First();
First f2=new First();

System.out.println(f1.a);
System.out.println(f2.a);

f1.a=200;
System.out.println(f1.a);
System.out.println(First.a);

f1.meth();
f2.meth();
}
}


/*
O/P:
This is static block in first class
Hello
100
This is static method
this is instance block in first class
Constructor in First class
this is instance block in first class
Constructor in First class
100
100
200
200
This is static method
This is static method
*/