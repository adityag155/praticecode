class Rectangle{
int length;
int width;
void insert(int l, int w){
length=l;
width=w;
}
void CalculateArea(){
System.out.println(length*width);}
}
class TestRectangle{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.insert(11,5);
r2.insert(10,5);
r1.CalculateArea();
r2.CalculateArea();
}
}