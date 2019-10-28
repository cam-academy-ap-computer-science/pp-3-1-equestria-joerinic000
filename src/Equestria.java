/*
 Call method that runs the calc
 
 CALC METHOD:
Variable input(X1(a), X2(b), Y1(c), Y2(e), D(d))
Use those variables(a, b, c, e) to do the subtraction in parentheses
Then square both values
Then add the two under next variable(d) 
Square root the variable(d) and set the variable(d) to that value
Return that value to the equation
 
 
 
 
 
 */
public class Equestria {
	//Class constants used for the points of city/place
	public static final int BALTX = 31;
	public static final int BALTY = 15;

	public static final int MANEX = 35;
	public static final int MANEY = 9;

	public static final int LOSPX = 6;
	public static final int LOSPY = 20;

	public static final int NEIGX = 24;
	public static final int NEIGY = 7;

	public static final int BADX = 28;
	public static final int BADY= 22;

	public static final int PONYX = 16;
	public static final int PONYY = 13;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double distance1 = calcMethod(BALTX, BALTY, MANEX, MANEY);
		 double distance2 = calcMethod(LOSPX, LOSPY, NEIGX, NEIGY);
		 double distance3 = calcMethod(	BADX, BADY, PONYX, PONYY);
		 System.out.println("The distance between Baltimare and Manehatten is " + distance1);
		 System.out.println("The distance between Los Pegasus and Neigagra Falls is " + distance2);
		 System.out.println("The distance between Badlands and Ponyville is " + distance3);
	}
	public static double calcMethod(int a, int b, int c, int d) {
		double x = (c - a) * (c - a);
		double y = (d - b) * (d - b);
		double distance = Math.sqrt((x + y));
		return distance;

	}
}
