public class MonkeysInATree {

    public static void main(String[] args) {
        // Loop starts with 5 and decrements down to 0
        for (int monkeys = 5; monkeys > 0; monkeys--) {

            // Converts the number of monkeys into words
            String numOfMonkey;

            switch (monkeys) {
                case 1:
                    numOfMonkey = "One";
                    break;
                case 2:
                    numOfMonkey = "Two";
                    break;
                case 3:
                    numOfMonkey = "Three";
                    break;
                case 4:
                    numOfMonkey = "Four";
                    break;
                case 5:
                    numOfMonkey = "Five";
                    break;
                default:
                    numOfMonkey = Integer.toString(monkeys);
            }

            // Printing the verse with the appropriate number of monkeys
            System.out.println(numOfMonkey + " little monkey" + (monkeys == 1 ? "" : "s") + " swinging in a tree");
            System.out.println("Teasing Mr Crocodile \"you can't catch me\"");
            System.out.println("Along came the crocodile as quiet as can be");
            System.out.println("and SNAP!");
            System.out.println();
        }

        // Print the final verse when there are no monkeys left
        System.out.println("No little monkeys swinging in a tree");
        System.out.println("No little monkeys swinging in a tree");
    }
}
