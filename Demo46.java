interface MyInter {
void meth();
}

class Class1 implements MyInter {
public void meth() {
        System.out.println("Meth in Class1");
    }
}

class Class2 implements MyInter {
    public void meth() {
        System.out.println("Meth in Class2");
    }
}

class MyClass {
    void myMeth(MyInter m) {
        m.meth();
    }
}

public class Demo46 {
    public static void main(String args[]) {
        Class1 c1 = new Class1();
        Class2 c2 = new Class2();

        MyClass m = new MyClass();
        m.myMeth(c1);
        m.myMeth(c2);
    }
}


/*
O/P:
Meth in Class1
Meth in Class2
*/