class First
{
private static final First f=new First();
private First(){}
void meth()
{
}
void display()
{
System.out.println("This is display");
}
static First getObject()
{
return f;
}
}

class Demo100
{
public static void main(String args[])
{
First f1;
f1=First.getObject();
f1.display();

f1.meth();
First f2;
f2=First.getObject();
System.out.println(f1==f2);
}
}

/*
O/P:
This is display
true
*/