import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your to find Leap year");
        int Year = sc.nextInt();
        sc.close();
        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println(Year + " Is A Leap Year");
        } 
        else {
            System.out.println(Year + " Is Not A Leap Year");
        }
    }
}
