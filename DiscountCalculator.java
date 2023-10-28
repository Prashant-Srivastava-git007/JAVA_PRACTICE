import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();

        double discount = 0.0;
        
        if (totalBill >= 1000 && totalBill <= 5000) {
            discount = totalBill * 0.05; // 5% discount
        } else if (totalBill > 5000 && totalBill <= 10000) {
            discount = totalBill * 0.10; // 10% discount
        } else if (totalBill > 10000 && totalBill <= 20000) {
            discount = totalBill * 0.15; // 15% discount
        } else if (totalBill > 20000) {
            discount = totalBill * 0.25; // 25% discount
        }

        
        double discountedAmount = totalBill - discount;
        

        System.out.println("-------------------------------");
        System.out.println("        Bill Receipt");
        System.out.println("-------------------------------");
        System.out.println("Total Bill Amount: $" + totalBill);
        System.out.println("Discount Amount: $" + discount);
        System.out.println("Amount to be Paid: $" + discountedAmount);
        System.out.println("-------------------------------");

        scanner.close();
    }
}
