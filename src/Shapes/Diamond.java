package Shapes;

public class Diamond extends Shape{
	
	Point p;
	int width;
	int height;
	MyDrawing drawing;
	Quadrilateral q;
	public Diamond(MyDrawing drawing, Point p, int width, int height)
	{
		this.drawing = drawing;
		this.p = p;
		this.height = height;
		this.width = width;
		
	}
	public void draw()
	{
		//int p2y = y + height / 2;
		//int p2x = x + width /2;
		
		
		
		
		q = new Quadrilateral(drawing, p.x,p.y, p.x + width, p.y, p.x + width, p.y + height, p.x, p.y + height);
		q.draw();
	}
	public boolean containsPoint(Point p)
	{
		return q.containsPoint(p);
	}
}
