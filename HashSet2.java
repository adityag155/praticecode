import java.util.*;

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
	public String toString()
	{
		return wname+" "+weight;
	}
}

class HashSet2 {

	public static void main(String[] args) {

		Wrestler obj=new Wrestler("Satish",125);
		
		HashSet<Wrestler>set=new HashSet<Wrestler>();
		
		set.add(new Wrestler("Satish",125));
		set.add(new Wrestler("Anil",120));
		set.add(new Wrestler("Uma",70));
		set.add(new Wrestler("Saket",100));
		set.add(new Wrestler("Vijay",110));
		
		System.out.println(set);	
	}
}

/*
O/P:
[Uma 70, Vijay 110, Satish 125, Anil 120, Saket 100]
*/