class First{
void meth(){
System.out.println("meth defined in First class");
}
}


class Second extends First{
void meth(){
System.out.println("Meth defined in 2nd class");
}
void access()
{
super.meth();
}
}

class Third extends First{
void meth(){
System.out.println("Meth defined in 3rd class");
}
void access()
{
super.meth();
}
}

class OverrdngEx2{
public static void main(String args[]){
Second s=new Second();
s.meth();
s.access();

Third t=new Third();
t.meth();
}	
}

/*
O/P:
Meth defined in 2nd class
meth defined in First class
Meth defined in 3rd class
*/