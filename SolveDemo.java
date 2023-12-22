class Rectangle {
double width, length;

Rectangle(double w, double l) {
width = w;
length = l;
}
}

class Triangle {
double base, height;

Triangle(double b, double h) {
base = b;
height = h;
}
}

class Area {
double rectangleArea;
double triangleArea;

Area(double rectArea, double triArea) {
rectangleArea = rectArea;
triangleArea = triArea;
}
}

class MyLogic {
Area calculate(Rectangle r, Triangle t) {
double rectArea = r.width * r.length;
double triArea = 0.5 * t.base * t.height;
return new Area(rectArea, triArea);
}
}

class SolveDemo {
public static void main(String[] args) {

Rectangle rectangle = new Rectangle(50, 60);
Triangle triangle = new Triangle(70, 80);

MyLogic myLogic = new MyLogic();
Area result = myLogic.calculate(rectangle, triangle);

System.out.println("Rectangle Area: " + result.rectangleArea);
System.out.println("Triangle Area: " + result.triangleArea);
}
}
