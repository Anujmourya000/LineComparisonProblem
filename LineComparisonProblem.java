
public class LineComparisonProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	 As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
//	 using the Cartesian system, So that I can calculate its length.
	
//		 A Length as 2 Points (x1, y1) and (x2, y2)
		
		int x1 = 2;
		int x2 = 4;
		int y1 = 6;
		int y2 = 10;
		
		double length_of_line = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		System.out.println("length of the line = " +length_of_line);
		
	}
	
	
}
