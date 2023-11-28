import java.util.Scanner;

public class Class5_Advance_Pattern {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Value");
int n = sc.nextInt();
sc.close();
// ButterFly Pattern
// * *
// ** **
// *** ***
// ********
// *** ***
// ** **
// * *
System.out.println("10:- ButterFly Pattern");
// Upper Part
for (int i = 1; i <= n; i++) {
// 1st Part
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
// Spaces
int Spaces1 = 2 * (n - i);
for (int j = 1; j <= Spaces1; j++) {
System.out.print(" ");
}
// 2nd Part
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
System.out.println(" ");
}
// Lower Part
for (int i = n; i >= 1; i--) {
// 1st Pattern
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
// Spaces
int Spaces1 = 2 * (n - i);
for (int j = 1; j <= Spaces1; j++) {
System.out.print(" ");
}
// 2nd Part
for (int j = 1; j <= i; j++) {
System.out.print("*");
}
System.out.println(" ");
}
// Solid Rhombus
// *****
// *****
// *****
// *****
// *****
System.out.println("11:- Solid Rhombus ");
for (int i = 1; i <= n; i++) {
int Space2 = n - i;
for (int j = 1; j <= Space2; j++) {
System.out.print(" ");
}
for (int j = 1; j <= n; j++) {
System.out.print("* ");
}
System.out.println("");
}
// Number Pyramid
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
System.out.println("12:- Number Pyramid");
for (int i = 1; i <= n; i++) {
// Spaces
int Spaces3 = n - i;
for (int j = 1; j <= Spaces3; j++) {
System.out.print(" ");
}
// Print Number
for (int j = 1; j <= i; j++) {
System.out.print(i + " ");
}
System.out.println("");
}
// Palindromic Pattern
// 1
// 2 1 2
// 3 2 1 2 3
// 4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
System.out.println("13:- Palindromic Pattern");
for(int i =1 ; i<=n; i++){
// Spaces
for(int j = 1; j<=n-i; j++){
System.out.print(" ");
}
// First Half Number
for (int j = i; j>=1; j--){
System.out.print(j);
}
// Second Half Number
for(int j =2; j<=i; j++){
System.out.print(j);
}
System.out.println(" ");
}
// Diamond Pattern
// *
// ***
// *****
// *******
// *******
// *****
// ***
// *
System.out.println("14:- Diamond Pattern");
// Upper Half
for (int i = 1; i <= n; i++) {
// Spaces
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
// Print Star
for (int j = 1; j <= 2 * i - 1; j++) {
System.out.print("*");
}
System.out.println("");
}
// Lower Half
for (int i = n; i >= 1; i--) {
// Spaces
for (int j = 1; j <= n - i; j++) {
System.out.print(" ");
}
// Print Star
for (int j = 1; j <= 2 * i - 1; j++) {
System.out.print("*");
}
System.out.println("");
}
}
}
