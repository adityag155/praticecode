class First{}

class Second extends First{}

class Third extends Second{}

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First f=new First();
		Second s=new Second();
		Third t=new Third();
		
		System.out.println(f instanceof First);		
		System.out.println(f instanceof Second);	
		System.out.println(f instanceof Third);

		System.out.println(s instanceof First);
		System.out.println(s instanceof Second);
		System.out.println(s instanceof Third);
		
		System.out.println(t instanceof First);
		System.out.println(t instanceof Second);
		System.out.println(t instanceof Third);
	}
}

/*
O/P:
true
false
false
true
true
false
true
true
true
*/