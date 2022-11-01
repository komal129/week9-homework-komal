package java_week9_hw_komal.Calculator;

/* 1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method and it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”. Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate) */

import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Main cal = new Main();

        while (true) {
            System.out.println("Enter first number");
            int num1 = read.nextInt();
            System.out.println("Enter second number");
            int num2 = read.nextInt();
            System.out.println("Choose the operator +, -, *, / ");
            char op = read.next().charAt(0);

            try {
                cal.calculateResult(num1, num2, op);
            }
            catch (ArithmeticException e){
                System.out.println("Invalid Operation");
                System.out.println(e.getMessage());
            }

            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N':");
            char ans = read.next().charAt(0);

            if(ans == 'n' || ans == 'N'){
                break;
            }
        }

        read.close();
    }

    public void calculateResult(int a, int b, char ch){
        if(ch == '+'){

            addition(a,b);
        } else if (ch == '-') {
            subtraction(a,b);
        } else if (ch == '*') {
            multiplication(a,b);
        } else if (ch == '/') {
            division(a,b);
        } else {
            System.out.println("Invalid input");
        }
    }
}
