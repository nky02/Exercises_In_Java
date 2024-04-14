import java.util.Scanner;

public class HarmonicSum {
    public static void main(String[] args) {

        int limitNum, count;
        double value, sum;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N (a number for integer limit)");
        limitNum = scan.nextInt();

        count = 1;
        sum = 0;
        while (count <= limitNum) {
            value = 1.0 / count;

            sum += value;
            count++;

        }
        System.out.println("Sum is: " + sum);
        scan.close();
    }

}
