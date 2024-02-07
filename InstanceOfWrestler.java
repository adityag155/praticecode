package adiiapplication;
class Wrestler
{
private String wname;
private int weight;

Wrestler(String wname, int weight)

{
this.wname=wname;
this.weight=weight;
}
public String getWname()
{
return wname;
}
public int getWeight()
{
return weight;
}

public boolean eqyals(Object obj)
{
if((obj instanceof Wrestler)&& ((Wrestler)obj).getWeight()==this.getWeight())
return true;
else 
return false;
}
}

class InstanceOfWrestler
{
public static void main(String args[])
{
Wrestler w1=new Wrestler("Satish",120);
Wrestler w2=new Wrestler("Anil",125);
Wrestler w3=new Wrestler("Satish",115);
Wrestler w4=new Wrestler("Saket",120);
Wrestler w5=new Wrestler("Satish",120);

System.out.println(w1.equals(w2));
System.out.println(w1.equals(w3));
System.out.println(w1.equals(w4));
System.out.println(w1.equals(w5));

}
}
/*
O/P:
false
false
false
false
*/