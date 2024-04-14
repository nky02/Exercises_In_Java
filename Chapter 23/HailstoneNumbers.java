import java.util.Scanner;

public class HailstoneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        long N = scanner.nextLong();

        int length = 0;
        long max = N;

        while (N != 1) {
            if (N % 2 == 0) {
                N = N / 2;
            } else {
                N = 3 * N + 1;
            }

            if (N > max) {
                max = N;
            }

            length++;
            System.out.println(N);
        }

        System.out.println("The length of the sequence is " + length);
        System.out.println("The maximum value in the sequence was " + max);

        scanner.close();
    }
}