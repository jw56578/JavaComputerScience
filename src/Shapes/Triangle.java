package Shapes;

public class Triangle extends Shape  {
	MyDrawing drawing;
	Point p1;
	Point p2;
	Point p3;
	
	public Triangle(MyDrawing drawing,int x1, int y1, int x2, int y2, int x3, int y3)
	{
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);

		this.drawing= drawing;
	}
	public void draw()
	{
		Line.draw(drawing, this,p1.x, p2.x, p1.y,p2.y);
		Line.draw(drawing,  this,p2.x, p3.x, p2.y, p3.y);
		Line.draw(drawing,  this,p3.x, p1.x, p3.y, p1.y);
	}
	public boolean containsPoint(Point p)
	{
		int x = p.x,y = p.y;
		int x1 = p1.x, y1 = p1.y;
		int x2 = p2.x, y2 = p2.y;
		int x3 = p3.x, y3 = p3.y;

		// no need to divide by 2.0 here, since it is not necessary in the equation
		double ABC = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
		double ABP = Math.abs (x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		double APC = Math.abs (x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		double PBC = Math.abs (x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));

		return ABP + APC + PBC == ABC;
	}
}
