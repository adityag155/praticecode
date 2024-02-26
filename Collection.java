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

Name.add(1,"Saurabh");
System.out.println(Name);

Name.remove(4);
System.out.println(Name);

Name.set(0,"Kedar");			//Set method can be used to replace value
System.out.println(Name);

System.out.println(Name.get(2));	//get method is used to print specific value

Name.clear();
System.out.println(Name);
}
}

/*
 * O/P:
 * [Adi, Anu, Ani, Omi]
[Adi, Anu, Ani, Omi, Ajith]
[Adi, Saurabh, Anu, Ani, Omi, Ajith]
[Adi, Saurabh, Anu, Ani, Ajith]
[Kedar, Saurabh, Anu, Ani, Ajith]
Anu
[]
*/
