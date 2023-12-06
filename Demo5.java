class First
{
static int a=100;

static void meth()
{
System.out.println("This is static method");
}
}
class Demo5
{
public static void main(String args[])
{
System.out.println(First.a);
First.meth();//After calling here meth then it will printed

First f1=new First();
First f2=new First();

System.out.println(f1.a);
System.out.println(f2.a);

f1.a=200;

System.out.println(First.a);
System.out.println(f2.a);
}
}

/*
O/P:
100
This is static method
100
100
200
200
*/