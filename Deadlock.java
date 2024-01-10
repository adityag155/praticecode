//Deadlock

class MyThread1 implements Runnable
{
Thread t;
Thread obj;
MyThread1(String tname)
{
t=new Thread(this, tname);
t.start();
}
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println(t.getName()+":"+i);
try
{
Thread.sleep(1000);
if(i==5)obj.join();
}
catch(InterruptedException ie)
{}
}
}
}


class MyThread2 implements Runnable
{
Thread t;
Thread obj;
MyThread2(String tname,Thread obj)
{
this.obj=obj;
t=new Thread(this,tname);
t.start();
}
public void run()
{
for(int i=11;i<=20;i++)
{
System.out.println(t.getName()+":"+i);
try
{
Thread.sleep(1000);
if(i==15)obj.join();
}
catch(InterruptedException ie)
{}
}
}
}


class Deadlock
{
public static void main(String args[])
{
MyThread1 m1=new MyThread1("One");
MyThread2 m2=new MyThread2("Two",m1.t);

m1.obj=m2.t;
}
}

/*
O/P:
One:1
Two:11
One:2
Two:12
One:3
Two:13
One:4
Two:14
One:5
Two:15
*/