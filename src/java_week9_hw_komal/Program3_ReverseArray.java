package java_week9_hw_komal;

//3. Write a Java program to reverse an array of integer values.
public class Program3_ReverseArray {

    public static void main(String[] args) {

        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

        // Printing original array

        for(int i=0; i<intArray.length; i++){

            System.out.print(intArray[i] + " ");
        }

        System.out.println();
        // Printing reverse array

        System.out.println("Reverse array is");
        for(int i = intArray.length-1; i>=0; i--){
            System.out.print(intArray[i] + " ");

        }
    }
}
