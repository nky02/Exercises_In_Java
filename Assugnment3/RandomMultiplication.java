/*This program asks the user 10 single-digit multiplication questions and checks the user's 
answers for each. The digits are chosen randomly and uses nextInt() method of class Random to pick random digits
Written by: Nicky Shane Estrada */

import java.util.Scanner;
import java.util.Random;

public class RandomMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int index, num1, num2, answer, correctAnswer = 0;

        index = 0;

        // ask 10 multiplication questions
        while (index < 10) {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            // Calculate the correct answer for the multiplication question
            answer = num1 * num2;

            // input
            System.out.printf("What is %d * %d? ", num1, num2);
            int userAnswer = scan.nextInt();

            // Check if the user's answer is correct
            if (userAnswer == answer) {
                System.out.println("Right!");
                correctAnswer++;
            } else
                // notify if answer is incorrect
                System.out.printf("Wrong. %d * %d is %d\n", num1, num2, answer);

            index++;
        }
        // Output the number of correct answers out of 10 questions
        System.out.printf("You got %d out of 10 questions correct!\n", correctAnswer);

        scan.close();
    }
}
