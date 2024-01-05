package adiiapplication;

class MyThread implements Runnable
{
    Thread t;

    MyThread(String tname)
    {
        t = new Thread(this, tname);
        t.start();
    }

    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println(t.getName() + ":" + i);

            try {
                Thread.sleep(1000); // Reduced sleep time for demonstration purposes
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}



public class ThreadCreate {

    public static void main(String[] args) {
        // Creating instances of MyThread
        new MyThread("One");
        new MyThread("Two");
        new MyThread("Three");
    }
}

/*
O/P:
Two:1
One:1
Three:1
Two:2
Three:2
One:2
Two:3
One:3
Three:3
Two:4
Three:4
One:4
*/