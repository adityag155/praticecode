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
	public boolean equals(Object obj)
	{
		if(obj instanceof Wrestler)
		{
			if(((Wrestler)obj).getWname().equals(this.getWname()))
				return true;
			else
				return false;
		}else
			return false;
	}
	public int hashCode()
	{
		if(weight>=20)
			return 1;
		else
			return 0;
	}
}

class HashSet3 {

	public static void main(String[] args) {
		

		Wrestler obj=new Wrestler("Satish",125);
		HashSet<Wrestler>set=new HashSet<Wrestler>();
		
		set.add(new Wrestler("Anil",120));
		set.add(new Wrestler("Uma",70));
		set.add(new Wrestler("Saket",100));
		set.add(new Wrestler("Vijay",110));
		
		System.out.println(set.contains(obj));		//f
	}
}

/*
O/P:
false
*/