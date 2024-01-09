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

class DemoThreadCreate
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
One:1
Three:1
Two:1
Two:2
One:2
Three:2
Three:3
One:3
Two:3
Two:4
Three:4
One:4
*/