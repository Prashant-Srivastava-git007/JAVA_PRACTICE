import java.util.Scanner;

public class Class4_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of ROW");
        int Row = sc.nextInt();
        System.out.println("Enter The Number of Column");
        int Column = sc.nextInt();
        sc.close();

        // Solid Rectangle
        // *****
        // *****
        // *****
        System.out.println("1:- Solid Rectanlge");
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= Column; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Hollow Rectangle
        // *****
        // * *
        // * *
        // *****
        System.out.println("2:- Hollow Rectangle");
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= Column; j++) {
                if (i == 1 || j == 1 || i == Row || j == Column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        // Half Piramid
        // *
        // **
        // ***
        // ****
        System.out.println("3:- Half Piramid");

        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Inverse Piramid
        // ****
        // ***
        // **
        // *
        System.out.println("4:- Inverse Piramid");
        for (int i = Row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        // Inverted 180 Piramid
        // *
        // **
        // ***
        // ****
        System.out.println("5:- Inverted 180 Piramid");
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= Row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // // Number Pattern
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        System.out.println("6:- Number Pattern");
        for (int i = 1; i <= Column; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // Inverted Number Pattern
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        System.out.println("7:- Inverted Number Pattern");
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= Row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        // Floyd's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        System.out.println("8:- Floyd's Triangle");
        int Num = 1;
        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Num + " ");
                Num++;
            }
            System.out.println();
        }

        // 0-1 Triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        System.out.println("9:- 0-1 Triangle");

        for (int i = 1; i <= Row; i++) {
            for (int j = 1; j <= i; j++) {
                int Sum = i + j;
                if (Sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }
    }

}
