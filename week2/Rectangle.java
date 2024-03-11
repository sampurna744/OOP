import java.util.Scanner;

public class Rectangle{
  public static void main(String[] args){
  Scanner scan= new Scanner(System.in);
  int length,breath,perimeter;
  System.out.print("Enter length and breath: ");
length = scan.nextInt();
breath = scan.nextInt();
perimeter = 2*(length + breath);
System.out.println("the ans is"+perimeter);}}



