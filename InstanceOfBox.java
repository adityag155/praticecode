class Box
{
double width, height, length;
Box(double w, double h, double l)
{
width=w;
height=h;
length=l;
}
}

class InstanceOfBox
{
public static void main(String args[])
{
Box b1=new Box(10,11,12);
Box b2=new Box(10,11,12);

System.out.println(b1==b2);		//f

System.out.println(b1.equals(b2));	//f

Integer i1=new Integer(10);
Integer i2=new Integer(10);
System.out.println(i1==i2);		//f

System.out.println(i1.equals(i2));	//t
}
}

/*
O/P:
false
false
false
true
*/