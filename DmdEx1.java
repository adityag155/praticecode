class First{
	void meth()
	{
		System.out.println("Meth defined in First class");
	}
}

class Second extends First{
	void meth()
	{
		System.out.println("Meth defined in second class");
	}
}

class Third extends First{
	void meth() {
		System.out.println("Meth defined in Third class");
	}
}

class Fourth extends First{
	void meth() {
		System.out.println("Meth defined in fourth class");
	}
}

class MyClass{
	void myMeth(First f)
	{
		f.meth();
	}
}

public class DmdEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
First f=new First();
Second s=new Second();
Third t=new Third();
Fourth fr=new Fourth();

MyClass m=new MyClass();
m.myMeth(f);
m.myMeth(s);
m.myMeth(t);
m.myMeth(fr);	
}
}

/*O/P:
Meth defined in First class
Meth defined in second class
Meth defined in Third class
Meth defined in fourth class
*/