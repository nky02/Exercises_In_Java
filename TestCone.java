import java.util.Scanner;

public class TestCone {

    public static void main(String[] args) {

        double radius, height;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:  ");
        radius = scan.nextDouble();

        System.out.println("Enter height: ");
        height = scan.nextDouble();

        Cone cone = new Cone(radius, height);

        System.out.println("Area: " + cone.area() + "Volume: " + cone.volume());

        scan.close();

    }

}
