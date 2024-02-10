//Generic & Sorting

import java.util.*;
class GenSrtDemo
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();
//ArrayList<String> list=new ArrayList<String>();

list.add("Tushar");
list.add("Kedar");
list.add("Avinash");
list.add("Rohan");
list.add("Omkar");

System.out.println(list);

Collections.sort(list);
System.out.println(list);
}
}