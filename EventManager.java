import java.util.Scanner;

public class EventManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Day No. to Get Event");
        int Choice = sc.nextInt();
        sc.close();
        switch (Choice) {
            case 1:
                System.out.println("Hello Today is Monday");
                System.out.println("Go for Doctor Appointment");
                break;
            case 2:
                System.out.println("Hello Today is Tuseday");
                System.out.println("You hava to meet mr Jhon");
                break;
            case 3:
                System.out.println("Hello Today is Wed. ");
                System.out.println("You have to submit your Files");
                break;
            case 4:
                System.out.println("Hello Today is Thu");
                System.out.println("You have to Go for lunch with Mrs deny");
                break;
            case 5:
                System.out.println("Hello Today is Fri");
                System.out.println("You have to submit Electricity Bill");
                break;
            case 6:
                System.out.println("Hello Today is Sat");
                System.out.println("You have to Go For Picnic");
                break;
            case 7:
                System.out.println("Hello Today is Sun");
                System.out.println("You have to Clean Garden");
                break;

            default:
                System.out.println("Error Enter No. Between 1-7");
                break;
        }
    }
}
