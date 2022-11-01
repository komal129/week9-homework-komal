package java_week9_hw_komal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//5. Write a Java program to iterate through all elements in an array list using Iterator.

public class Program5_IteratorArraylist {

    public static void main(String[] args) {

        List<String> testNG = new ArrayList();
        testNG.add("Komal");
        testNG.add("Humaira");
        testNG.add("Reshma");
        testNG.add("Anisha");
        testNG.add("Hiral");
        testNG.add("Sunil");
        testNG.add("Pratik");
        testNG.add("Raj");

        Iterator i = testNG.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
