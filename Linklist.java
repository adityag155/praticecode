//when we used linkedlist class then it will be printed list in sequence as we written

import java.util.*;

class Linklist
{
public static void main(String args[])
{
LinkedList list=new LinkedList();

list.add("One");
list.add("Two");
list.add("Three");
list.add("One");

System.out.println(list);		//[One, Two, Three, One]

for(int i=0;i<list.size();i++)
System.out.println((String)list.get(i));

list.add(1,"Five");
System.out.println(list);		//[One, Five, Two, Three, One]

list.remove(1);
System.out.println(list);		//[One, Two, Three, One]
}
}

/*
O/P:
[One, Two, Three, One]
One
Two
Three
One
[One, Five, Two, Three, One]
[One, Two, Three, One]
*/