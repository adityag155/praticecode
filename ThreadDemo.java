class ThreadDemo
{
public static void main(String args[])
{
Thread t;
t=Thread.currentThread();
System.out.println(t);

t.setName("My Thread");
System.out.println(t);

String tname=t.getName();
System.out.println(tname);

for(int i=1; i<=4;i++)
{
System.out.println(i);

try
{
Thread.sleep(10000);
}
catch(InterruptedException ie)
{}
}
}
}

/*
O/P:
Thread[main,5,main]
Thread[My Thread,5,main]
My Thread
1
2
3
4
*/