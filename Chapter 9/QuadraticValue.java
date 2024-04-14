/*This program calculates the quadratic value for a floating point number 
 using the quadraic formula
    Written by: Nicky Shane Estrada*/

public class QuadraticValue {
    public static void main(String[] args) {
        // Assign a value to X
        double x, quadraticValue;
        x = 4.0;

        // Compute the value of the quadratic expression
        quadraticValue = 3 * x * x - 8 * x + 4;

        System.out.println("At X = " + x + " the value is " + quadraticValue);
    }
}
