class First
{
static int a=100;
}
class Demo3
{
public static void main(String args[])
{
System.out.println(First.a);

First f1=new First();
First f2=new First();

System.out.println(f1.a);
System.out.println(f2.a);
}
}
