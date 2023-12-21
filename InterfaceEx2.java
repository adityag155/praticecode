package adiiapplication;

interface MyInter{
	int num1=100;
}

class MyClass implements MyInter{}

public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MyInter.num1);
System.out.println(MyClass.num1);
	}

}

/*
O/P:
100
100
*/