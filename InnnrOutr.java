class Outer
{
int a=100;
Inner obj=new Inner();

void access()
{
Inner i=new Inner();
i.showa();
}

class Inner
{
void showa()
{
System.out.println("a="+a);
}
}
}
class InnnrOutr
{
public static void main(String args[])
{
Outer o=new Outer();
o.access();

o.obj.showa();

Outer.Inner oi=new Outer().new Inner();
oi.showa();

oi=o.obj;
oi.showa();

new Outer().new Inner().showa();
}
}

/*
O/P:
a=100
a=100
a=100
a=100
a=100
*/