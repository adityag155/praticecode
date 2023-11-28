class Box
{
double width,height,length;

void assignVal(double width,double height,double length)
{
this.width=width;
this.height=height;
this.length=length;
}
void volume()
{
System.out.println("Volume="+width*height*length);
}
}
class ThisKey
{
public static void main(String args[])
{
Box b1=new Box();
b1.assignVal(10,20,30);
b1.volume();
}
}


//O/P
//Volume=6000.0