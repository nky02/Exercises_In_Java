/*This program prints out a table of x and ln(x) and is formatted using HTML
 Written by: Nicky Shane Estrada*/

public class LogTable {
    public static void main(String[] args) {
        int x;
        double logx;
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<table>");
        System.out.println("<tr><th>x</th><th>ln(x)</th></tr>");

        // loops through x values from 1 to 10
        for (x = 1; x <= 10; x++) { // Assuming you want the log table for x from 1 to 10
            logx = Math.log(x);// Calculate natural logarithm of current x value
            System.out.println("<tr><td>" + x + "</td><td>" + logx + "</td></tr>");
        }
        // print closing table and tags
        System.out.println("</table>");
        System.out.println("</body>");
        System.out.println("</html>");
    }
}