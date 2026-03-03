import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        double weight = sc.nextDouble();
        double kg = weight / 2.2;

        System.out.println("The weight of the person in pounds is "
                + weight + " and in kg is " + kg);
    }
}
}