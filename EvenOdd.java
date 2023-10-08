import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        //Q1:- Find Even Odd 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Your Number");
        int num = sc.nextInt();
        System.out.println(num%2==0 ?"Number is Even" : "Number is odd");
        sc.close();

    }
}
