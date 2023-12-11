package adiiapplication;

class First
{
	int a=100;
}

class Second extends First
{
	int a=200;
	
	void access()
	{
		System.out.println(super.a);
	}
}

public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s=new Second();
		System.out.println(s.a);
		s.access();

	}

}
