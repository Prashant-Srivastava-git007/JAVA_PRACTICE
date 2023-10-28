import java.util.Scanner;

public class tax {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your sallery");
    int sallery = sc.nextInt();
    int tax_10 = (sallery*10)/100;
    int tax_15 = (sallery*15)/100;
    int tax_25 = (sallery*25)/100;
    sc.close();
    if(sallery >= 10000 && sallery<= 20000){
       System.out.println("You are applicable for 10% and claculated tax is " +tax_10);
     if(sallery >= 20000 && sallery <= 30000){
        System.out.println("You are applicable for 15% and calculated tax is" +tax_15);
     }
     if(sallery>30000) {
        System.out.println("You are applicable for 25% and calculated tax is" +tax_25);
     }
    }
    else{
        System.out.println("Not applicable for tax");
    }
 }   
}
