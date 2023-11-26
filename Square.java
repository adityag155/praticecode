class First
{
int num;
void square(int num)
{
System.out.println("Square="+num*num);
}
}

class Square
{
public static void main(String args[])
{
First f=new First();
f.square(19);
}
}