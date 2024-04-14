/*This program converts a degree into radians and
calculates its sine,cosine value, and sum of both  values' squares
    Written by: Nicky Shane Estrada*/

public class DegreesToRadians {
    public static void main(String[] args) {

        double radians, sine, cos, sumOfSquares;
        double degrees = 30;

        radians = degrees * Math.PI / 180;

        sine = Math.sin(radians);
        cos = Math.cos(radians);

        sumOfSquares = (sine * sine) + (cos * cos);

        // Output
        System.out.println("Sine: " + sine + " Cosine: " + cos + " Sum of squares: " + sumOfSquares);
    }
}