//HashMap printed the list randomly & if we mention 2same object repeatedly it will update as per you mention the last one not mention twise in list like ex:Pune

//HashMap can set name in two pairs Key &b Vaalue.Ex:Pune,30, So Pune is key and 30 is value

import java.util.*;

class HsMpDemo
{
public static void main(String args[])
{
HashMap map=new HashMap();

map.put("Pune",34);
map.put("Mumbai",37);
map.put("Chennai",30);
map.put("Jaipur",32);
map.put("Pune",30);

System.out.println(map);		//{Chennai=30, Jaipur=32, Pune=30, Mumbai=37}

Set set=map.entrySet();
//System.out.println(map);

Iterator it=set.iterator();
Map.Entry me=null;
String key="";
Integer value=null;

while(it.hasNext())
{
me=(Map.Entry)it.next();
key=(String)me.getKey();

value=(Integer)me.getValue();
System.out.println(key+"  "+value);
}
}
}
/*
O/P:
{Chennai=30, Jaipur=32, Pune=30, Mumbai=37}
Chennai  30
Jaipur  32
Pune  30
Mumbai  37
*/