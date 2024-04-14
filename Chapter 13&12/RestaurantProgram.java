
import java.util.Scanner;

public class RestaurantProgram {
    static final double TAX_RATE = 0.20;

    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        double basicCost, tipPercent;

        System.out.print("Enter the basic cost: ");
        basicCost = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter tip percentage: ");
        tipPercent = scan.nextDouble() * basicCost;

        System.out.println("basic cost: " + basicCost + " total cost: " +
                (basicCost + tipPercent + basicCost * RestaurantProgram.TAX_RATE));

        scan.close();
    }
}
