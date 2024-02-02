/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int random1, random2, random3;
            random1 = (int) ((Math.random()*(b-a))+a);
            random2 = (int) ((Math.random()*(b-a))+a);
            random3 = (int) ((Math.random()*(b-a))+a);
            System.out.println(random1);
            System.out.println(random2);
            System.out.println(random3);
            System.out.println("The minimal generated value was " + Math.min(random1, Math.min(random2, random3)));	
	}
}
