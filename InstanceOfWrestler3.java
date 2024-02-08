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
	public int getweight()
	{
		return weight;
	}
	
	public boolean equals(Object obj)
	{
		if((obj instanceof Wrestler) && ((Wrestler)obj).getWname().equals(this.getWname()))
		return true;
		else
			return false;
	}
}

public class InstanceOfWrestler3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wrestler w1=new Wrestler("Satish",120);
		Wrestler w2=new Wrestler("Anil",125);
		Wrestler w3=new Wrestler("Saket",115);
		Wrestler w4=new Wrestler("Satish",120);
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
true
true
*/