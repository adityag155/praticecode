package adiiapplication;


interface MyInter{
	int num=300;
}

class MyClass implements MyInter{}
public class InterfaceEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(MyInter.num);
System.out.println(MyClass.num);
}
	

}


/*
O/P:
300
300
*/