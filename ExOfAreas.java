class FigureEx {
    double dim1, dim2, dim3;

    FigureEx(double d1, double d2, double d3) {
        dim1 = d1;
        dim2 = d2;
        dim3 = d3;
    }

    FigureEx(double d1, double d2) {
        dim1 = d1;
        dim2 = d2;
    }

    FigureEx(double d1) {
        dim1 = d1;
    }

    FigureEx(double d1, double d2, double d3, int type) {
        dim1 = d1;
        dim2 = d2;
        dim3 = d3;
    }

    void area() {
        System.out.println("Area in figure class");
    }
}

class Cube extends FigureEx {
    Cube(double side) {
        super(side, side, side);
    }

    void area() {
        double area = 6 * dim1 * dim1;
        System.out.println("Area of cube=" + area);
    }
}

class Sphere extends FigureEx {
    double radius;

    Sphere(double r) {
        super(r, 0);
        radius = r;
    }

    void area() {
        double area = 4.0 / 3.0 * 3.14 * radius * radius * radius;
        System.out.println("Area of sphere=" + area);
    }
}

class Cylinder extends FigureEx {
    double radius;

    Cylinder(double r) {
        super(r, 0);
        radius = r;
    }

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Cylinder=" + area);
    }
}

class MyClass {
    void myArea(FigureEx f) {
        f.area();
    }
}

class ExOfAreas {
    public static void main(String args[]) {
        Cube cb = new Cube(10);
        Sphere sp = new Sphere(20);
        Cylinder cy = new Cylinder(30);

        MyClass m = new MyClass();
        m.myArea(cb);
        m.myArea(sp);
        m.myArea(cy);
    }
}

/*
O/P:
Area of cube=600.0
Area of sphere=33493.333333333336
Area of Cylinder=2826.0
*/