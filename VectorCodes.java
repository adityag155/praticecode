import java.util.*;
class First
{
void display()
{
System.out.println("This is display");
}
public String toString()
{
return "Desc of First class";
}
}

class VectorCodes
{
public static void main(String args[])
{
Vector v=new Vector(3,2);		//here are 3 compartments means capacity and add +2 when 						ant to add  more no

System.out.println(v.capacity());
System.out.println(v.size());

v.add("One");
v.add("Two");		//Here Capacity=3
v.add("Three");		//AND Size=3

System.out.println(v.capacity());
System.out.println(v.size());

v.add("Four");		//Size=4
System.out.println(v.capacity());     //Capacity will calculate how many compartments	=5
System.out.println(v.size());	      //Size will calculate how many compartment filled

}
}

/*
O/P:
3
0
3
3
5
4
*/