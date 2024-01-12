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
MyThread2(String tname)
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

class MyThread3 implements Runnable
{
Thread t;
Thread obj;
MyThread3(String tname)
{
t=new Thread(this, tname);
t.start();
}
public void run()
{
for(int i=21;i<=30;i++)
{
System.out.println(t.getName()+":"+i);
try
{
Thread.sleep(1000);
if(i==25)obj.join();
}
catch(InterruptedException ie)
{}
}
}
}




class DeadLock3 {
    public static void main(String args[]) {
        MyThread1 m1 = new MyThread1("One");
        MyThread2 m2 = new MyThread2("Two");
        MyThread3 m3 = new MyThread3("Three");




        m2.obj = m1.t;
        m3.obj = m2.t;
        m1.obj = m3.t;
}
}

/*
O/P:
One:1
Two:11
Three:21
Three:22
Two:12
One:2
Two:13
One:3
Three:23
Three:24
Two:14
One:4
Three:25
Two:15
One:5
*/