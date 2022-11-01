package java_week9_hw_komal;

// 6. Write a Java program to retrieve an element (at a specified index) from a given array list

import java.util.ArrayList;

public class Program6_RetrieveFromArray {

    public static void main(String[] args) {

        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        color.add("Black");
        color.add("Red");
        color.add("Blue");
        System.out.print(color + "\n");
        System.out.print(color.get(4));
    }
}
