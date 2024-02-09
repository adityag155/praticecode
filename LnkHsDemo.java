import java.util.*;

class LnkHsDemo
{
public static void main(String args[])
{
LinkedHashSet<String> set=new LinkedHashSet<String>();

set.add("One");
set.add("Two");
set.add("Three");
set.add("Four");

System.out.println(set.add("One"));	//false

System.out.println(set);		//[One, Two, Three, Four]

set.remove(3);
System.out.println(set);

Iterator it=set.iterator();
while(it.hasNext())
{
System.out.println((String)it.next());
}


set.remove("Four");
System.out.println(set);			//[One, Two, Three]


}
}

/*
O/P:
false
[One, Two, Three, Four]
[One, Two, Three, Four]
One
Two
Three
Four
[One, Two, Three]
*/