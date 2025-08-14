import java.util.Scanner;
    public class AOT {
    
        public static void main(String[] args) {
            java.util.Scanner sc = new Scanner(System.in);
            System.out.println("Enter base of the traingle :");
            double b= sc.nextDouble();
            System.out.println("Enter height of the traiangle:");
            double h = sc.nextDouble();
            double area = 0.5 * b* h ;
            System.out.println("Area of triangle is :"+area+"sq.cm ");
        }
    }