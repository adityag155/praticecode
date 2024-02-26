import java.io.*;
class Box implements Serializable
{
double width,height,length;
Box(double w, double h, double l)
{
width=w;
height=h;
length=l;
}
}
class Serlzn
{
public static void main(String args[])throws IOException
{
Box b1=new Box(20,30,40);

FileOutputStream fos=new FileOutputStream("India.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(b1);
fos.close();
oos.close();
}
}

//In the India.txt file width height length will be printed
//fos can be used to write data India.txt file