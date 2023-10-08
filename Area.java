import java.util.Scanner;

public class Area {

   
    // This program is a two-in-one tool that first calculates the area of a circle and then seamlessly transitions to calculate the area of a rectangle, all within a single execution. Here's how it works:
    // 1. It starts by taking the user's input for the radius of the circle.
    // 2. It calculates the area of the circle using the formula `π * radius^2`.
    // 3. It then proceeds to calculate the area of a rectangle, taking user inputs for its length and width.
    // 4. It calculates the area of the rectangle as `length * width`.
    // 5. Finally, it displays both the circle and rectangle areas to the user.

    public static void main(String[] args) {
        System.out.println("This Program is used to find Area of a Circle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle");
        int Radius = sc.nextInt();
        double area = Math.PI * Math.pow(Radius, 2);
        System.out.println("The Area of Circle is " + area);

        System.out.println("This program is used to find Area of a Rectangle");
        System.out.println("Enter Your Lenght");
        float Lenght = sc.nextInt();
        System.out.println("Enter the Width");
        float Width = sc.nextInt();
        float area2 = Lenght * Width;
        System.out.println("The area of Rectangle is " + area2);
        sc.close();
    }
}
