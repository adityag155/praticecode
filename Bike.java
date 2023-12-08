class Bike{
void run()
{System.out.println("Running");}
class Splendor extends Bike{
void run()
{
System.out.println("Running safely with 60km");
}
public static void main(String args[]){
Bike b=new Splendor();
b.run();
}
}