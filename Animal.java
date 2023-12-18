class Animal{
void eat()
{System.out.println("Eating");}
class Dog extends Animal{
void eat()
{System.out.println("Eating Bread");}
}
class BabyDog extends Dog{
void eat()
{System.out.println("Drinking Milk");}
}
public static void main(String args[]){
Animal a1,a2,a3;
a1=new Animal();
a2=new Dog();
a3=new BabyDog();
a1.eat();
a2.eat();
a3.eat();
}
}