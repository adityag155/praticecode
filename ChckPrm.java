class Outer
{
void checkPrime()
{
Inner i=new Inner();
int num=i.num;
boolean flag=true;

for(int cnt=2;cnt<=num/2;cnt++)
{
if(num%cnt==0)
{
flag=false;
break;
}
}
if(flag)
System.out.println("The number" +num+ "is Prime");
else
System.out.println("The number" +num+ "is not Prime");
}
}
class Inner
{
int num=12;
}
class ChckPrm
{
public static void main(String args[])
{
Outer o=new Outer();
o.checkPrime();
}
}