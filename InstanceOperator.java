 class First{}

class Second extends First{}

class Third extends Second{}

public class InstanceOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First f=new First();
		Second s=new Second();
		Third t=new Third();
		System.out.println(f instanceof First);		//t
		System.out.println(f instanceof Second);	//f
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
false
false

true
true
false

true
true
true
*/