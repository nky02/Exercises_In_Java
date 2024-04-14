class javaPrac {
    public static void main(String a[]) {

        int result = 2 + 2;
        double num1 = 5.20, num2 = 5.20;
        float num3 = 5.30f, num4 = 5.20f;
        long num5 = 10_000_000_000l;
        char c = 'a';
        c++;

        System.out.println("Hello Java!");
        System.out.println(2024);
        System.out.println(4 * 4);
        System.out.println(num1 / num2);
        System.out.println(num3 + num4);
        System.out.println(result);
        System.out.println(num5);
        System.out.println(c);
    }
}

// first lesson:
// the name of the class should be the same of the java file name
// use print"ln" function for new line
// no need to use for quotation marks for numbers
// JVM(Java Virtual Machine) can only understand bytecode
// public static void main is equivalent to int main in C
// javaPrac.class is the bytecode file of your java file
// JRE(Java Runtime Environment) is us
// use double for two digit decimal numbers
// when defining float numbers, initialize it with putting f at th end of the
// digit
// same with long integer, put l at the end of the number
/*
 * you can declare and initialize at one line
 * //same with long integer, put l at the end of the numberat the same time for
 * multiple
 * variables
 */
// you can also increment characters or letters