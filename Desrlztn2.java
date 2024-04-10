import java.io.*;

class Student implements Serializable {
    int stuRollNo;
    String stuName;
}
 
class Desrlztn2 {
public static void main(String args[]) throws IOException, ClassNotFoundException {
Student s1 = new Student();
	
s1.stuRollNo = 7;
s1.stuName = "Amol";

FileInputStream fis = new FileInputStream("India.txt");
       
ObjectInputStream ois = new ObjectInputStream(fis);
 
Student s2 = (Student) ois.readObject(); // Typecasting the readObject result to Student
ois.close();

        // Now, you can use s2, the deserialized object
System.out.println("Deserialized Object:");
System.out.println("Roll No: " + s2.stuRollNo);
System.out.println("Name: " + s2.stuName);
}
}
