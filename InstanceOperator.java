class First{}

class Second extends First{}

public class InstanceOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First f=new First();
		Second s=new Second();
		Third t=new Third();
		System.out.println(f instanceof First);
		System.out.println(f instanceof Second);
		System.out.println(f instanceof Third);
		
	
	}

}

/*
O/P:
true
false
false
*/