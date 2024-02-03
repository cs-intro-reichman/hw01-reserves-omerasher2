/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int cents;
        cents = Integer.parseInt(args[0]);
        int reminder, reva;
        reminder = cents%25;
        reva = cents/25;
        System.out.println("Use " + reva + " quarters and " + reminder + " cents");
	}
}