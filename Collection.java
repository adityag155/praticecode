import java.util.ArrayList;

class Collection
{
public static void main(String args[])
{
ArrayList<String> Name=new ArrayList<String>();
Name.add("Adi");
Name.add("Anu");
Name.add("Ani");
Name.add("Omi");
System.out.println(Name);
		
Name.add("Ajith");
System.out.println(Name);
}
}

/*
 * O/P:
 * [Adi, Anu, Ani, Omii]
[Adi, Anu, Ani, Omii, Ajith]
*/
