//List Printed Randomly
//Hashset Does not allow duplicates


import java.util.*;
class HsDemo
{
public static void main(String args[])
{
HashSet set=new HashSet();

set.add("One");
set.add("Two");
set.add("Three");
set.add("Four");

System.out.println(set);				//[One, Four, Two, Three]
System.out.println(set.add("One"));		//Hashset Does not allow duplicates i.e. O/P:F

set.remove(3);
System.out.println(set);


Iterator it=set.iterator();
while(it.hasNext())

System.out.println((String)it.next());

set.add(3);

set.remove("Four");
System.out.println(set);			//[3, One, Two, Three]

set.remove(3);
System.out.println(set);			//[One, Two, Three]
}
}


/*
O/P:
[One, Four, Two, Three]
false
[One, Four, Two, Three]
One
Four
Two
Three
[3, One, Two, Three]
[One, Two, Three]
*/