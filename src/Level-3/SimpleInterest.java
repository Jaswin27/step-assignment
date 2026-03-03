import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + si +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);
    }
}
}