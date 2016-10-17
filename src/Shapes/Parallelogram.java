package Shapes;

public class Parallelogram extends Shape{
	
	Point p;
	Point p2;
	Point p3;

	int width;
	int height;
	MyDrawing drawing;
	Quadrilateral q;
	public Parallelogram(MyDrawing drawing, Point p1, Point p2, Point p3)
	{
		
		//the point top left is starting point
		//the top rightpoint could be anywhere so that needs to be given
		//the third point can be anywhere
		//the slope has to be maintined
		//the height can be anything
		this.drawing = drawing;
		this.p = p1;
		this.p2 = p2;
		this.p3 = p3;

		//the fourth point is the key
		//the y has to be y + the differe
	
		
	}
	public void draw()
	{
		int p4x = Math.abs(p2.x - p3.x);
		if(p2.x < p3.x)
			p4x = p.x + p4x;
		else
			p4x = p.x - p4x;
		
		int p4y = Math.abs(p2.y  -p3.y);
		if(p2.y < p3.y)
			p4y = p.y + p4y;
		else
			p4y = p.y - p4y;
		q = new Quadrilateral(drawing, p.x,p.y, p2.x, p2.y, p3.x , p3.y, p4x, p4y);
		q.draw();
	}
	public boolean containsPoint(Point p)
	{
		return q.containsPoint(p);
	}
}
