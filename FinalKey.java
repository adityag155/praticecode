class First
{
final int a;
First()
{
a=600;
}
First(int num)
{
a=num;
}
}

class FinalKey
{
public static void main(String args[])
{
First f1=new First();
System.out.println(f1.a);

First f2=new First(123);
System.out.println(f2.a);
}
}

/*
O/P:
600
123
*/