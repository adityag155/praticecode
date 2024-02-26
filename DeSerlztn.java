import java.io.*;

class Box implements Serializable {
    double width, height, length;

    Box(double w, double h, double l) {
        width = w;
        height = h;
        length = l;
    }
}

class DeSerlztn {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Box b1 = new Box(20, 30, 40);

        FileInputStream fis = new FileInputStream("India.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Corrected the line to properly cast the object
        Box b2 = (Box) ois.readObject();

        // Close the streams
        ois.close();
        fis.close();

        System.out.println(b2.width + " " + b2.height + " " + b2.length);
    }
}


/*
O/P:
20.0 30.0 40.0
*/