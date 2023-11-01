import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int Age = sc.nextInt();
        sc.close();
     if (Age<=10 && Age>0) {
        System.out.println("You are Child");
     }
     else if (Age>10 && Age <=18) {
        System.out.println("You are Teenager");
     }
     else if (Age>18 && Age<=40) {
        System.out.println("You are Adult");
     }
     else if (Age>40 && Age<100) {
        System.out.println("You are Senior");
     }
     else{
        System.out.println("Enter Correct Age");
     }
    }
}
