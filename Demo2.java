package adiiapplication;

class Rectangle
{
	double width,length;
	Rectangle(double w,double l)
	{
		width=w;
		length=l;
	}
}

class Triangle
{
	double base,height;
	Triangle(double b,double h)
	{
		base=b;
		height=h;
	}
}

class Area
{
	double rectangleArea;
	double triangleArea;
	Area(double rectArea, double triArea)
	{
		rectangleArea=rectArea;
		triangleArea=triArea;
	}
}

class MyLogic
{
	Area calculate(Rectangle r, Triangle t)
	{
	double rectangleArea=r.width*r.length;
	double base=0;
	double triangleArea=0.5*base*t.height;
	Area a=new Area(rectangleArea,triangleArea);
	return a;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rectangle rect=new Rectangle(10,20);
Triangle t=new Triangle(3,40);

MyLogic ml=new MyLogic();
Area a=ml.calculate(rect, t);

System.out.append("Area of Rectangle="+a.rectangleArea);
System.out.println("\n Area of Triangle="+a.triangleArea);
	}
}
