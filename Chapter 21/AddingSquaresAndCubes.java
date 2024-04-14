import java.util.Scanner;

public class AddingSquaresAndCubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the upper limit N
        System.out.print("Upper Limit:\n");
        int N = scanner.nextInt();

        // Initialize sum variables
        int sumOfSquares = 0;
        int sumOfCubes = 0;
        int i = 1;

        // Calculating sums using a loop
        while (i <= N) {
            sumOfSquares += i * i;
            sumOfCubes += i * i * i;
            i++;
        }

        System.out.println("The sum of Squares is " + sumOfSquares);
        System.out.println("The sum of Cubes is " + sumOfCubes);

        int formulaSumOfSquares = N * (N + 1) * (2 * N + 1) / 6;
        int formulaSumOfCubes = (int) Math.pow(N * (N + 1) / 2, 2);

        System.out.println("Formula for sum of Squares: " + formulaSumOfSquares);
        System.out.println("Formula for sum of Cubes: " + formulaSumOfCubes);

        scanner.close();
    }
}