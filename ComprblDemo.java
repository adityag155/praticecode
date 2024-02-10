//Comparable

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Wrestler implements Comparable<Wrestler>
{
private String wname;
private int weight;

Wrestler(String wname, int weight) {
this.wname = wname;
this.weight = weight;
}

public String getWname()
{
return wname;
}

public int getWeight()
{
return weight;
}

   
public String toString() {
return wname + " " + weight;
}

public int compareTo(Wrestler obj)
{
// Compare based on weight
return Integer.compare(this.getWeight(), obj.getWeight());
}
}

public class ComprblDemo
{
public static void main(String args[])
{
List<Wrestler> list = new ArrayList<>();

list.add(new Wrestler("Manisha", 70));
list.add(new Wrestler("Anurag", 120));
list.add(new Wrestler("Uma", 65));
list.add(new Wrestler("Saket", 125));
list.add(new Wrestler("Tushar", 100));

System.out.println(list);		 //[Manisha 70, Anurag 120, Uma 65, Saket 125, Tushar 100]

Collections.sort(list);
System.out.println(list);		//[Uma 65, Manisha 70, Tushar 100, Anurag 120, Saket 125]
}
}
/*
O/P:
[Manisha 70, Anurag 120, Uma 65, Saket 125, Tushar 100]
[Uma 65, Manisha 70, Tushar 100, Anurag 120, Saket 125]
*/
