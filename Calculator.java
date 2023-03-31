import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        operator = scanner.next().charAt(0);

        if (operator == '+') {
            result = num1 + num2;
            if (num1 == (int)num1 && num2 == (int)num2) {
                System.out.println("Answer: " + (int)result);
            }else{
                System.out.println("Answer: " + result);
            }     

        } else if (operator == '-') {
            result = num1 - num2;
            if (num1 == (int)num1 && num2 == (int)num2) {
                System.out.println("Answer: " + (int)result);
            }else{
                System.out.println("Answer: " + result);
            }    

        } else if (operator == '*') {
            result = num1 * num2;
            if (num1 == (int)num1 && num2 == (int)num2) {
                System.out.println("Answer: " + (int)result);
            }else{
                System.out.println("Answer: " + result);
            }    

        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");
            } else {
                result = num1 / num2;
                if (num1 == (int)num1 && num2 == (int)num2) {
                System.out.println("Answer: " + (int)result);
                }else{
                   System.out.println("Answer: " + result);
                }  
            }

        } else {
            System.out.println("Invalid operator!");
        }
    }
}
