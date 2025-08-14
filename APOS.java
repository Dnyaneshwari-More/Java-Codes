 import java.util.Scanner;
 public class APOS {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the Square:");

    double length = sc.nextDouble();
    double area = length*length;
    double perimeter = 4 * length;
    System.out.println("Area of the Square is: " + area + " sq.cm");
    System.out.println("Perimeter of the Square is: " + perimeter + " cm");
} 
}
