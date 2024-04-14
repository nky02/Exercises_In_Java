import java.util.Scanner;

public class AddUpIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer, numOfIntegers = 0, integersSum = 0;

        System.out.print("Enter an integer (enter 0 to quit): ");
        integer = scan.nextInt();

        if (integer == 0) {
            System.out.println("No integers were entered.");
        } else {
            integersSum += integer;
            numOfIntegers++;

            System.out.print("Enter an integer (enter 0 to quit): ");
            integer = scan.nextInt();

            while (integer != 0) {
                integersSum += integer;
                numOfIntegers++;

                System.out.print("Enter an integer (enter 0 to quit): ");
                integer = scan.nextInt();
            }
            System.out.println("Number of integers entered: " + numOfIntegers);
            System.out.println("Sum of integers: " + integersSum);
        }

        System.out.println("bye");
        scan.close();
    }
}
