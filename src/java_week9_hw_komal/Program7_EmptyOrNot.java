package java_week9_hw_komal;

// 7. Write a Java program to test an array list is empty or not. Define array list with underground tube names

import java.util.ArrayList;
import java.util.List;

public class Program7_EmptyOrNot {

    public static void main(String[] args) {

        List<String> tubesnames = new ArrayList();
        tubesnames.add("Bakerloo");
        tubesnames.add("Piccadilly");
        tubesnames.add("Metropolitan");
        tubesnames.add("Central");
        tubesnames.add("Jubilee");

        boolean ans = tubesnames.isEmpty();
        if(ans == true){
            System.out.println("Array list is empty");
        } else {

            System.out.println("Array list is not empty");
        }
    }
}
