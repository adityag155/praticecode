//Thread Priority

class MyThread implements Runnable
{
Thread t;
boolean b=true;
long cnt=0;

MyThread(int p)
{
t=new Thread(this);
t.setPriority(p);
t.start();
}
public void run()
{
while(b)
cnt++;
}
}

class ThreadPriority
{
public static void main(String args[])
{
MyThread m1=new MyThread(4);
MyThread m2=new MyThread(7);

try
{
Thread.sleep(1000);
}
catch(InterruptedException ie)
{}
m1.b=false;
m2.b=false;

System.out.println(m1.cnt);
System.out.println(m2.cnt);

}
}
/*
O/P:
146414598
146870689
*/