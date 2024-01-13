//Interthread Communication:

class First
{
int i;
boolean b=false;

synchronized void put(int num)
{
if(b)
{
try
{
wait();
}
catch(InterruptedException ie)
{}
}
i=num;
System.out.println("Put:"+i);
notify();
b=true;
}

synchronized int get()
{
if(!b)
{
try
{
wait();
}
catch(InterruptedException ie)
{}
}

System.out.println("Get:"+i);
notify();
b=false;
return i;
}
}

class Putter implements Runnable
{
Thread t;
First f;
Putter(First z)
{
f=z;

t=new Thread(this);
t.start();
}

public void run()
{
int k=0;

while(f.i<30)
f.put(++k);
}
}

class Getter implements Runnable
{
Thread t;
First f;

Getter(First z)
{
f=z;
t=new Thread(this);
t.start();
}

public void run()
{
while(f.i<30)
f.get();
}
}

class PutGet
{
public static void main(String args[])
{
First f1=new First();
new Putter(f1);
try
{
Thread.sleep(5000);
}
catch(InterruptedException ie)
{}
new Getter(f1);
}
}

/*
O/P:
Put:1
Get:1
Put:2
Get:2
Put:3
Get:3
Put:4
Get:4
Put:5
Get:5
Put:6
Get:6
Put:7
Get:7
Put:8
Get:8
Put:9
Get:9
Put:10
Get:10
Put:11
Get:11
Put:12
Get:12
Put:13
Get:13
Put:14
Get:14
Put:15
Get:15
Put:16
Get:16
Put:17
Get:17
Put:18
Get:18
Put:19
Get:19
Put:20
Get:20
Put:21
Get:21
Put:22
Get:22
Put:23
Get:23
Put:24
Get:24
Put:25
Get:25
Put:26
Get:26
Put:27
Get:27
Put:28
Get:28
Put:29
Get:29
Put:30
Get:30
*/