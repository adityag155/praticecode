import java.util.*;
class Rectangle
{
double width, length;
Rectangle(double width, double length)
{
this.width=width;
this.length=length;
}
}
class MyLogic
{
void area(Rectangle r)
{
System.out.println("Area of rectangle="+(r.width*r.length));
}
void perimeter(Rectangle r)
{
System.out.println("Perimeter of rectangle="+(2*(r.width + r.length)));
}
}
class RectExp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter width of rectangle");
double w=sc.nextDouble();

System.out.println("Enter length of rectangle");
double l=sc.nextDouble();

Rectangle rect=new Rectangle(w,l);
MyLogic ml=new MyLogic();
ml.area(rect);
ml.perimeter(rect);
}
}


//Enter width of rectangle
20
Enter length of rectangle
40
Area of rectangle=800.0
Perimeter of rectangle=120.0//
