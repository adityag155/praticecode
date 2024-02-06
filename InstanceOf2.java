class First{}

class Second extends First{}

class Third extends Second{}

class InstanceOf2{

public static void main(String args[]){

First f=new First();
Second s=new Second();
Third t=new Third();

f=s;

System.out.println(f instanceof First);		//t
System.out.println(f instanceof Second);	//t
System.out.println(f instanceof Third);		//f

System.out.println(s instanceof First);		//t
System.out.println(s instanceof Second);	//t
System.out.println(s instanceof Third);		//f

System.out.println(t instanceof First);		//t
System.out.println(t instanceof Second);	//t
System.out.println(t instanceof Third);		//t
}
}

/*
O/P:
true
true
false

true
true
false

true
true
true
*/