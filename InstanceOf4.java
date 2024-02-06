class First{}

class Second extends First{}

class Third extends Second{}

class InstanceOf4
{
public static void main(String args[])
{

First f=new First();
Second s=new Second();
Third t=new Third();

f=t;
System.out.println(f instanceof First); 
System.out.println(f instanceof Second);
System.out.println(f instanceof Third);

System.out.println(s instanceof First); 
System.out.println(s instanceof Second);
System.out.println(s instanceof Third);		//f

System.out.println(t instanceof First); 
System.out.println(t instanceof Second);
System.out.println(t instanceof Third);
}
}

/*
O/P:
true
true
true

true
true
false

true
true
true
*/
