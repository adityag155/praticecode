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

class DemoThread
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
Three:1
Two:1
One:1
One:2
Two:2
Three:2
Three:3
Two:3
One:3
One:4
Three:4
Two:4
*/