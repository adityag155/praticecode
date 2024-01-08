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
for(int i=5;i<=8;i++)
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

class ThreadLogic3 implements Runnable
{
public void run()
{
for(int i=9;i<=12;i++)
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
Thread t1,t2,t3;

MyThread(String tname1, String tname2, String tname3)
{
t1=new Thread(new ThreadLogic1(),tname1);
t2=new Thread(new ThreadLogic2(),tname2);
t3=new Thread(new ThreadLogic3(),tname3);



t1.start();
t2.start();
t3.start();
}
}

class ThreadCreate3
{
public static void main(String args[])
{
new MyThread("One","Two","Three");
}
}

/*
O/P:
Two:5
One:1
Three:9
Two:6
One:2
Three:10
Two:7
One:3
Three:11
Two:8
One:4
Three:12
*/