import java.util.Scanner;
import java.util.Random;

public class RandomMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int index, num1, num2, answer, correctAnswer = 0;

        index = 0;

        while (index < 10) {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            answer = num1 * num2;

            System.out.printf("What is %d * %d? ", num1, num2);
            int userAnswer = scan.nextInt();

            if (userAnswer == answer) {
                System.out.println("Right!");
                correctAnswer++;
            } else
                System.out.printf("Wrong. %d * %d is %d\n", num1, num2, answer);

            index++;
        }

        System.out.printf("You got %d out of 10 questions correct!\n", correctAnswer);

        scan.close();
    }
}
