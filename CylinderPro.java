package adiiapplication;

class CylinderArea
{
	double radius;
	CylinderArea(double radius)
	{
		this.radius=radius;
	}
	void crossSectionalArea()
	{
		System.out.println("Area="+3.14*radius*radius);
	}
}
class CylinderVolume extends CylinderArea
{
	double height;
	CylinderVolume(double radius, double height)
	{
		super(radius);
		this.height=height;
	}
	void volume()
	{
		System.out.println("Volume="+3.14*radius*radius*height);
	}
}

public class CylinderPro {
	public static void main(String args[])
	{
	CylinderVolume cv=new CylinderVolume(10,20);
	cv.crossSectionalArea();
	cv.volume();

}
}

/*
O/P:
Area=314.0
Volume=6280.0
*/