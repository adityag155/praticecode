//when we used HashSet class then it will be printed list Randomly.

import java.util.*;

class HashDemo
{
public static void main(String args[])
{

HashSet set=new HashSet();

set.add("One");
set.add("Two");
set.add("Three");
set.add("Four");

System.out.println(set.add("One"));

System.out.println(set);		//[One, Four, Two, Three]

set.add(3);
System.out.println(set);		//[3, One, Four, Two, Three]

set.remove(3);
System.out.println(set);		//[One, Four, Two, Three]

set.remove("Four");
System.out.println(set);		//[One, Two, Three]

}
}

/*
O/P:
false
[One, Four, Two, Three]
[3, One, Four, Two, Three]
[One, Four, Two, Three]
[One, Two, Three]
*/