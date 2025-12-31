/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {

		//// Uncomment the first code block to test the curve function.
		//// Uncomment the second code block to test the snowflake function.
		//// Uncomment only one block in each test, and remember to compile
		//// the class whenever you change the test.

        
		// Tests the curve function:
		// Gets n, x1, y1, x2, y2,
		// and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
		curve(Integer.parseInt(args[0]),
			  Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
		      Double.parseDouble(args[3]), Double.parseDouble(args[4]));
		

		/*
		// Tests the snowflake function:
		// Gets n, and draws a Koch snowflake of n edges in the standard canvass.
		snowFlake(Integer.parseInt(args[0]));
		*/
	}

	/** Gets n, x1, y1, x2, y2,
     *  and draws a Koch curve of depth n from (x1,y1) to (x2,y2). */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if (n == 0) {
			return;
		}
		StdDraw.line(x1, y1, x2, y2);
		double x13 = (x1 + x2) / 3;
		double x23 = (x1 + x2) / 3 + x13;
		double p3x = (y1 - y2) * (Math.sqrt(3) / 6) + (0.5 * (x1 + x2));
		double p3y = (x2 - x1) * (Math.sqrt(3) / 6) + (0.5 * (y1 + y2));
		System.out.println(x2 - x1);
		
		//erases the middle of the line
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.line(x13, y1, x23, y2);

		//draws the triangle sides
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.line(x13, y1, p3x, p3y);
		StdDraw.line(p3x, p3y, x23, y2);

		//recursion call
		curve(n - 1, x1, y1, x13, y2);
		//curve(n - 1, x23, y1, x2, y2);
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
		// A little tweak that makes the drawing look better
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0, 1.1);
		// Draws a Koch snowflake of depth n
		//// Write the rest of your code below.
	}
}
