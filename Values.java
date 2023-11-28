class Box
{
double width,height,length;
void assignVal(double w, double h,double l)
{
width=w;
height=h;
length=l;
}
void volume()
{
System.out.println("Volume ="+width*height*length);
}
}
class Values
{
public static void main(String args[])
{
Box b1=new Box();
b1.assignVal(20,30,40);
b1.volume();
}
}



//O/P:
//Volume =24000.0