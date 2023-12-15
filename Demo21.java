class Figure {//cube
double dim1, dim2, dim3;

Figure(double d1, double d2, double d3) {
dim1 = d1;
dim2 = d2;
dim3 = d3;
}//cube

Figure(double d1, double d2) {//sphere
dim1 = d1;
dim2 = d2;
}//sphere


Figure(double d1) {//Cylinder
dim1 = d1;
}//cylinder


Figure(double d1, double d2, double d3, int type) {//Cone
dim1 = d1;
dim2 = d2;
dim3 = d3;
}//Cone

void area() {
System.out.println("Area in figure class");
}
}

class Cube extends Figure {
Cube(double side) {
super(side, side, side);
}

void area() {
double area = 6 * dim1 * dim1;
System.out.println("Area of cube = " + area);
}
}//cube

class Sphere extends Figure {
double radius;

Sphere(double r) {
super(r, 0); 
radius = r;
}

void area() {
double area = 4.0 / 3.0 * 3.14 * radius * radius * radius;
System.out.println("Area of sphere = " + area);
}
}//sphere

class Cylinder extends Figure {
double radius;

Cylinder(double r) {
super(r, 0); 
radius = r;
}

void area() {
double area =3.14*radius*radius;
System.out.println("Area of Cylinder = " + area);
}
}//cylinder

class Cone extends Figure   //cone
{
double radius;
double length;

Cone(double r, double l){
super(r,0,0);
radius=r;
length=l;
}

void area(){
double area=1.0/3.*3.14*radius*radius*length;
System.out.println("Area of Cone ="+area);
}
}//Cone


class MyClass {
void myArea(Figure f) {
f.area();
}
}

public class Demo21 {
public static void main(String[] args) {

Cube cb = new Cube(10);
Sphere sp = new Sphere(10);
Cylinder cy=new Cylinder(20);
Cone co=new Cone(30,40);

MyClass m = new MyClass();
m.myArea(cb);
m.myArea(sp);
m.myArea(cy);
m.myArea(co);
}
}


/*
O/P:
Area of cube = 600.0
Area of sphere = 4186.666666666667
Area of Cylinder = 1256.0
Area of Cone =37680.0
*/