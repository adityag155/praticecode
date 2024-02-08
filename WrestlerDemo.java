class Wrestler
{
private String wname;
private int weight;
private String state;

Wrestler(String wname, int weight, String state)
{
this.wname=wname;
this.weight=weight;
this.state=state;
}

public String getWname()
{
return wname;
}

public int getWeight()
{
return weight;
}

public String getState()
{
return state;
}

public boolean equals(Object obj)
{
/*if((obj instanceof Wrestler) && ((Wrestler)obj).getWeight()==this.getWeight()) && ((Wrestler)obj).getState()!= (this.getState())
*/
if (obj instanceof Wrestler && ((Wrestler) obj).getWeight() == this.getWeight() && 
!((Wrestler) obj).getState().equals(this.getState()))


return true;
else
return false;
}
}

class WrestlerDemo
{
public static void main(String args[])
{
Wrestler w1 = new Wrestler("Satish",120,"Maharshtra");
Wrestler w2 = new Wrestler("Anil",130,"Gujrat");
Wrestler w3 = new Wrestler("Ashok",120,"Maharshtra");
Wrestler w4 = new Wrestler("Sachin",120,"Bihar");
Wrestler w5 = new Wrestler("Ramesh",108,"Assam");

System.out.println(w1.equals(w2));
System.out.println(w1.equals(w3));
System.out.println(w1.equals(w4));
System.out.println(w1.equals(w5));
}
}


