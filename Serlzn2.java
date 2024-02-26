import java.io.*;

class Student implements Serializable {
    int stuRollNo;
    String stuName;
}

class Serlzn2 implements Serializable
{
public static void main(String args[])throws IOException
{
Student s1=new Student();
s1.stuRollNo=4;
s1.stuName="Abhi";

FileOutputStream fos=new FileOutputStream("India.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(s1);

System.out.println("Object saved in file");
}
}