package adiiapplication;

class First
{
	void meth()
	{
		System.out.println("Meth defined in 1st class");
	}
}

class Second extends First
{
	void meth() {
		System.out.println("Meth define in second class");
	}
	void access()
	{
		super.meth();
	}
}


public class MethodOverridingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Second s=new Second();
		s.meth();
		s.access();
	}
}

/*
O/P:
Meth defined in First class
Meth Define din Second class
*/
