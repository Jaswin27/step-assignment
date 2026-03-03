import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;   // b*c evaluated first
        double result2 = a * b + c;   // a*b evaluated first
        double result3 = c + a / b;   // a/b evaluated first
        double result4 = a % b + c;   // a%b evaluated first

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f%n",
            result1, result2, result3, result4);
    }
}