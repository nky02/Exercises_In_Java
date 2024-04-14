import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N, R;
        long factN = 1, factNR = 1;

        System.out.print("Enter N (positive integer): ");
        N = scan.nextLong();

        System.out.print("Enter R (non-negative integer less than or equal to N): ");
        R = scan.nextLong();

        long tempN = N;
        long tempNR = N - R;
        while (tempN > 1 || tempNR > 1) {
            if (tempN > 1) {
                factN *= tempN;
                tempN--;
            }
            if (tempNR > 1) {
                factNR *= tempNR;
                tempNR--;
            }
        }

        long permutations = factN / factNR;

        System.out.println("Number of permutations of " + N + " objects taken " + R + " at a time: " + permutations);

        scan.close();
    }
}
