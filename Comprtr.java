import java.util.*;


class Wrestler
{
private String wname;
private int weight;

public Wrestler(String wname, int weight)
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

public String toString()
{
return wname+" "+weight;
}
}

class WeightComparator implements Comparator<Wrestler>
{
public int compare(Wrestler obj1, Wrestler obj2)
{
return obj1.getWname().compareTo(obj2.getWname());
}
}

class Comprtr
{
public static void main(String args[])
{
ArrayList<Wrestler>list=new ArrayList<Wrestler>();

list.add(new Wrestler("Manisha",70));
list.add(new Wrestler("Aditya",120));
list.add(new Wrestler("Uma",65));
list.add(new Wrestler("Saket",125));
list.add(new Wrestler("Tushar",100));

System.out.println(list);

Collections.sort(list,new WeightComparator());
System.out.println(list);

/*Collections.sort(list,new NameComparator());
System.out.println(list);
*/
}
}

/*
O/P:
[Manisha 70, Aditya 120, Uma 65, Saket 125, Tushar 100]
[Aditya 120, Manisha 70, Saket 125, Tushar 100, Uma 65]
*/
