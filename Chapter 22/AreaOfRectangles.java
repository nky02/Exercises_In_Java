/*This program calculates the area of a triangle 
using two pairs of user-input coordinates
     Written by: Nicky Shane Estrada */

import java.util.Scanner;

public class AreaOfRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2, width, height, area;

        System.out.print("First corner X coordinate: ");
        x1 = scanner.nextInt();
        System.out.print("First corner Y coordinate: ");
        y1 = scanner.nextInt();

        System.out.print("Second corner X coordinate: ");
        x2 = scanner.nextInt();
        System.out.print("Second corner Y coordinate: ");
        y2 = scanner.nextInt();

        width = Math.abs(x2 - x1);
        height = Math.abs(y2 - y1);

        if (width == 0 || height == 0) {
            System.out.println("Width:  0  Height: 0   Area: 0");
            System.out.println("finished");
        } else {

            while (width != 0 && height != 0) {
                area = width * height;

                System.out.println("Width:  " + width + "  Height: " + height + "   Area: " + area + "\n");

                System.out.print("First corner X coordinate: ");
                x1 = scanner.nextInt();
                System.out.print("First corner Y coordinate: ");
                y1 = scanner.nextInt();

                System.out.print("Second corner X coordinate: ");
                x2 = scanner.nextInt();
                System.out.print("Second corner Y coordinate: ");
                y2 = scanner.nextInt();

                width = Math.abs(x2 - x1);
                height = Math.abs(y2 - y1);
            }

            System.out.println("finished");
        }

        scanner.close();
    }
}
