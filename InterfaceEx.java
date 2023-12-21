interface MyInter
{
int MY_VAR=100;
}

class MyClass implements MyInter{}

class InterfaceEx{
public static void main(String args[]){
System.out.println(MyInter.MY_VAR);

}
}

/*
O/P:
100
*/