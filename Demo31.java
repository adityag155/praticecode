class First{
void meth(){
System.out.println("Meth defined in 1st class");
}
}
class Second extends First{
void meth(){
System.out.println("Meth defined in 2nd class");
}
}
class Third extends First{
void meth(){
System.out.println("Meth defined in 3rd class");
}
}
class Fourth extends First{
void meth(){
System.out.println("Meth defined in 4th class");
}
}

class MyClass{
void myMeth(First f){
f.meth();
}
}
class Demo31
{
public static void main(String args[]){
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