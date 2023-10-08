import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        //Q1:- Write a Java Program to find Even and Odd number which is enterd by the user without using If-Else Statement 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your Number");
        int num = sc.nextInt();
        System.out.println(num%2==0 ?"Number is Even" : "Number is odd");
        sc.close();

    }
}
