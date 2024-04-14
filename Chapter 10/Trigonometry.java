/*This program calculates  a double precision number's  sine,cosine value,  
and the sum of  both the squared values
    Written by: Nicky Shane Estrada*/

public class Trigonometry {
    public static void main(String[] args) {

        double sine, cos, sumOfSquares;

        // compute sine of 0.5236
        sine = Math.sin(0.5236);

        // Compute cosine of 0.5236 radians
        cos = Math.cos(0.5236);

        // Compute the square of sine and cosine
        sumOfSquares = (sine * sine) + (cos * cos);

        // output
        System.out.println("sine: " + sine + " cosine: " + cos + " sum of squares: " + sumOfSquares);
    }
}