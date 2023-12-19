abstract class First{
abstract void meth();
}
class Second extends First
{
void meth()
{
System.out.println("Meth defined in Second class");
}
}
class Third extends First{
void meth()
{
System.out.println("Meth defined in 3rd class");
}
}

class MyClass{
First Mymeth()
{
return new Second();
}
}

class Demo45{
public static void main(String args[]){

Second s=new Second();

MyClass m=new MyClass();
First f;
f=m.Mymeth();
f.meth();
}
}

/*
O/P:
Meth defined in Second class
*/