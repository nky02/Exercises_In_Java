public class PineTree {

    public static void main(String[] args) {
        int height = 8;
        int spaces = height - 1;
        int stars = 1;

        int row = 0;
        while (row < height) {
            int column = 0;
            while (column < spaces) {
                System.out.print(" ");
                column++;
            }

            column = 0;
            while (column < stars) {
                System.out.print("*");
                column++;
            }

            System.out.println();
            row++;
            spaces--;
            stars += 2;
        }

        int trunkWidth = 3;
        int trunkHeight = 3;
        row = 0;
        while (row < trunkHeight) {
            int column = 0;
            while (column < height - trunkWidth / 2) {
                System.out.print(" ");
                column++;
            }

            column = 0;
            while (column < trunkWidth) {
                System.out.print("*");
                column++;
            }

            System.out.println();
            row++;
        }
    }
}
