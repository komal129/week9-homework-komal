package java_week9_hw_komal;

// 9. Create a HashMap object called people that will store String keys and Integer values: And use for each loop
// to iterate the value from Map.

import java.util.HashMap;

public class Program9_HashmapStringInteger {

    public static void main(String[] args) {

        HashMap<String, Integer> people = new HashMap<>();
        people.put("Ram", 10);
        people.put("Shyam", 20);
        people.put("Shiv", 30);

        people.forEach((key, value)-> {

            System.out.println(key + " " +value);
        });
    }
}
