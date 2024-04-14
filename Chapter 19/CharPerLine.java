import java.util.Scanner;

public class CharPerLine{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String word;
        int index, count;

        System.out.println("Enter a word: ");
        word = scan.nextLine();
        count = word.length(); 

        index = 0;
        while (index < count){
            System.out.println(word.charAt(index));
            index++;
        }

        scan.close();

    }
}