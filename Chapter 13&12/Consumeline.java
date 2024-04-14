import java.util.Scanner;

public class Consumeline {
    public static void main(String[] args) {
        int age;
        String name;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter your age: ");
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your name: ");
        name = scan.nextLine();

        System.out.println("\nYou're name is " + name + ", " + " and you are " + age + " years old.\n");

        scan.close();
    }
}
