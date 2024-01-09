class MyThread implements Runnable
{
Thread t;
MyThread(String tname)
{
t=new Thread(this, tname);
t.start();
}

public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println(t.getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class IsAlive
{
public static void main(String args[])
{
MyThread m1=new MyThread("One");
MyThread m2=new MyThread("Two");
MyThread m3=new MyThread("Three");

System.out.println(m1.t.isAlive());
System.out.println(m2.t.isAlive());
System.out.println(m3.t.isAlive());
try
{
m1.t.join();
m2.t.join();
m3.t.join();
}
catch(InterruptedException ie)
{}
System.out.println(m1.t.isAlive());
System.out.println(m2.t.isAlive());
System.out.println(m3.t.isAlive());
}
}

/*
O/P:
true
true
true
Three:1
Two:1
One:1
Two:2
One:2
Three:2
Three:3
Two:3
One:3
Three:4
One:4
Two:4
false
false
false
*/