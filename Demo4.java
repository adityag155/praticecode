class First
{
static int a=100;
}
class Demo4
{
public static void main(String args[])
{
System.out.println(First.a);

First f1=new First();
First f2=new First();
First f3=new First();

System.out.println(f1.a);
System.out.println(f2.a);
System.out.println(f3.a);

f1.a=200;//printing this value
System.out.println(f3.a);
System.out.println(First.a);

f2.a=300;//Printing this value
System.out.println(f2.a);
}
}

/*
O/P:
100
100
100
100
200
200
300
*/
