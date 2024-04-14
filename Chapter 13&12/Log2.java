import java.util.Scanner;

public class Log2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a double: ");
        double number = scan.nextDouble();

        double BaseLog = Math.log(number) / Math.log(2);
        System.out.println("Base 2 of log " + number + " is " + BaseLog);

        scan.close();

    }
}
