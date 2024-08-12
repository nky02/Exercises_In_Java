public class Cone {

    private double radius;      //instance variables
    private double height;

    public Cone(double radius, double height) {     //constructor

        this.radius = radius;       //just copy what is in the parameter list
        this.height = height;

    }

    public double area() { //method 

        return Math.PI * radius * (radius * Math.sqrt(radius * radius + height * height));
    }

    public double volume() { //method

        return Math.PI * radius * radius * height / 3.0;
    }
}
