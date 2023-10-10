import java.util.Scanner;

public class variableSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int varr1 = sc.nextInt();
System.out.println("Enter Your Second Number");
        int varr2 = sc.nextInt();
        varr1 = varr1 + varr2;
        varr2 = varr1 - varr2;
        varr1 = varr1 - varr2;
        System.out.println("Number after Swapping" +varr1 +" " +varr2);
        sc.close();
    }
}
