/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args)
	{
	double a, b, c;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        System.out.println(a + " * x + " + b + " = " + c);
        double d = c - b;
        double x = d / a;
        System.out.println("x = " + x);
		
	}
}