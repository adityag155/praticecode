class Box
{
double width,height,length;
Box(double w, double h, double l)
{
width=w;
height=h;
length=l;
}
}
class MyClass
{
Box doubleVal(Box b)
{
Box c=new Box(b.width*2,b.height*2,b.length*2);return c;
}
}

class Increase

{
public static void main(String args[])
{
Box b1=new Box(22,44,88);

MyClass m=new MyClass();
Box b2=m.doubleVal(b1);

System.out.println(b1.width+" "+b1.height+" "+b1.length);
System.out.println(b2.width+" "+b2.height+" "+b2.length);
}
}

/*
O/P:
22.0 44.0 88.0
44.0 88.0 176.0
*/