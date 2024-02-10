import java.util.*;

class TreeSetDemo {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<>();

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");

        System.out.println(set.add("One"));  // false
        System.out.println(set);  // [Four, One, Three, Two]

	set.add("3");
        set.remove("Three");  // Remove the element "Three" instead of index 3
        System.out.println(set);  // [3, Four, One, Two]

    }
}
/*
false
[Four, One, Three, Two]
[3, Four, One, Two]
*/
