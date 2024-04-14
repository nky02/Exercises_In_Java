import java.util.Scanner;

public class EchoWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int times;

        System.out.print("Enter a word: ");
        inputString = scanner.nextLine();

        times = inputString.length();

        int count = 0;
        while (count < times) {
            System.out.println(inputString);
            count++; 
        }

        scanner.close();
    }
}