import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First THe Num");
        int Num1 = sc.nextInt();
        System.out.println("Enter THe Second Num");
        int Num2 = sc.nextInt();
        System.out.println("Enter THe Third Num");
        int Num3 = sc.nextInt();
        sc.close();
        if ((Num1>Num2)&&(Num1>Num3)) {
            System.out.println(Num1+ " Is Biggest Number");
        }
        else if (Num2>Num1 && Num2>Num3) {
            System.out.println(Num2+" Is Bigest Number");
        }
        else if ((Num1 == Num2) && (Num1 == Num3)){
            System.out.println("Each Are Equal");
        }
        else{
            System.out.println(Num3+" Is Bigest Number");
        }
    }
}
