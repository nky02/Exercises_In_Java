import java.util.Scanner;

public class PraceticeWordRepetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word;

        System.out.print("Enter a word: ");
        word = scan.nextLine();

        int i = 10;

        while (i > 0) {
            System.out.println(word);
            i--;
        }

        scan.close();
    }
}
