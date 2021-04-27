
public class LineComparisonProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//	 As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
//	 using the Cartesian system, So that I can calculate its length.
	
//		 A Length as 4 Points (x1, y1), (x2, y2) , (x3, y3) , (x4, y4)
		
		int x1 = 2;
		int x2 = 4;
		int y1 = 6;
		int y2 = 10;
		
		int x3 = 4;
		int x4 = 8;
		int y3 = 12;
		int y4 = 16;
		
		Integer line1 = (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		
		Integer line2 = (int) Math.sqrt((y4 - y3) * (y4 - y3) + (x4 - x3) * (x4 - x3));
		
			
			System.out.println(line1.compareTo(line2));
			System.out.println("Hence, line1 is less than line2");
			
		
		
	}
	
	
}
