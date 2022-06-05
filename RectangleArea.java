class Rectangle
{
	int length, breadth;  // variable declaration
	
	void getdata(int x, int y) // define a Method
	{
		length = x;
		breadth = y;
	}
	
	int rectArea() // define another Method
	{
		int area = length*breadth;
		return area;
	}
}
public class RectangleArea 
{

	public static void main(String[] args) 
	{
		Rectangle r1,r2; // declare an object
		r1 = new Rectangle(); // instantiate the object or create object
		r2 = new Rectangle();
		
		// BY ACCESSING VARIABLES
		r1.length = 4;
		r1.breadth = 5;
		int area1 = r1.length*r1.breadth;
		
		// BY ACCESSING METHODS
		r2.getdata(12,3);
		int area2 = r2.rectArea();
		
		System.out.println(area1+" "+area2);
		
	}

}
