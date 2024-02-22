class MyThread implements Runnable
{
Thread t;
MyThread(String tname)
{
t=new Thread(this,tname);
t.start();
}
public void run()
{
for (int i=1;i<=3;i++)
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

class ThrdDemo
{
public static void main(String args[])
{
new MyThread("One");
new MyThread("Two");
new MyThread("Three"); 
}
}
/*
O/P:
Two:1
Three:1
One:1
Two:2
Three:2
One:2
Two:3
Three:3
One:3
*/