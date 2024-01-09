class ThreadLogic1 implements Runnable
{
public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class ThreadLogic2 implements Runnable
{
public void run()
{
for(int i=1;i<=4;i++)
{
System.out.println(Thread.currentThread().getName()+":"+i);
try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
}
}
}

class MyThread
{
Thread t1,t2;

MyThread(String tname1,String tname2)
{
t1=new Thread(new ThreadLogic1(), tname1);
t2=new Thread(new ThreadLogic2(), tname2);

t1.start();
t2.start();
}
}

class DemoofThread
{
public static void main(String args[])
{
new MyThread("One","Two");
}
}

/*
O/P:
One:1
Two:1
Two:2
One:2
One:3
Two:3
One:4
Two:4
*/