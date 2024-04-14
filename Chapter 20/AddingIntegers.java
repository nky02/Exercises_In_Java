import java.util.Scanner;

public class AddingIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index, integer, numOfIntegers, integersSum = 0;

        System.out.println("How many integers will be added? ");
        numOfIntegers = scan.nextInt();

        index = 0;
        while (index < numOfIntegers) {
            System.out.println("Enter an integer: ");
            integer = scan.nextInt();

            integersSum += integer;
            index++;
        }

        System.out.println("The sum is " + integersSum);
        scan.close();
    }
}