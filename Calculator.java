import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Enter First number:");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        int result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The Addition of Both Number is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The Subtraction of Both Number is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The Multiplication of both Number is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The Division of two number is: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
