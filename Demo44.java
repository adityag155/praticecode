class Solid {
double dim1;
double dim2;

Solid(double d1) {
dim1 = d1;
}

Solid(double d1, double d2) {
dim1 = d1;
dim2 = d2;
}

void volume() {
System.out.println("Volume in solid class");
}
}

class Cylinder extends Solid {
Cylinder(double radius, double height) {
super(radius, height);
}

void volume() {
System.out.println("Volume of cylinder: " + 3.14 * dim1 * dim1 * dim2);
}
}//Cylinder

class Cube extends Solid {
Cube(double side) {
super(side);
}

void volume() {
System.out.println("Volume of cube: " + (dim1 * dim1 * dim1));
}
}//Cube

class Cone extends Solid {
Cone(double radius, double height) {
super(radius, height);
}

void volume() {
System.out.println("Volume of cone: " + (1.0 / 3.0 * 3.14 * dim1 * dim1 * dim2));
}
}//Cone

class MyClass {
void myVolume(Solid s) {
s.volume();
}
}

public class Demo44 {
public static void main(String[] args) {

Cube c = new Cube(30);
Cone co = new Cone(30, 40);
Cylinder cy=new Cylinder(10,20);

MyClass m = new MyClass();
m.myVolume(c);
m.myVolume(co);
m.myVolume(cy);
}
}

/*
O/P:
Volume of cube: 27000.0
Volume of cone: 37680.0
Volume of cylinder: 6280.0
*/