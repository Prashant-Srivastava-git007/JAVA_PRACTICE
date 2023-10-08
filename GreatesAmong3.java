import java.util.Scanner;

public class GreatesAmong3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter Your Third Number");
        int num3 = sc.nextInt();
        System.out.println("The Bigest No. Among Entered Number is:");
        System.out.println(num1 > num2 ? ( num1 > num3 ? "The Biggest number is " +num1 : "The Biggest Number is " +num3) : (num2 > num3 ? "The Biggest Number is " +num2 : "The Biggest Number is " +num3) );
        
        sc.close();

    }
}
