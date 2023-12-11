class Cylinder1 {
    double radius;

    Cylinder1(double r) {
        radius = r;
    }

    void area() {
        System.out.println("Area=" + (3.14 * radius * radius));
    }
}

class Cylinder2 extends Cylinder1 {
    double height;

    Cylinder2(double r, double h) {
        super(r);
        height = h;
    }

    void volume() {
        System.out.println("Volume=" + (3.14 * radius * radius * height));
    }
}

class Cylinder3 extends Cylinder2 {
    double density;

    Cylinder3(double r, double h, double d) {
        super(r, h);
        density = d;
    }

    void mass() {
        System.out.println("Mass=" + (density * 3.14 * radius * radius * height));
    }
}

class Demo12 {
    public static void main(String args[]) {
        Cylinder3 c3 = new Cylinder3(10, 20, 30);

        c3.area();
        c3.volume();
        c3.mass();
    }
}

/*
O/P:
Area=314.0
Volume=6280.0
Mass=188400.0
*/