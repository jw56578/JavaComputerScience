package Shapes;

public class Quadrilateral extends Shape {
	MyDrawing drawing;
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;
	int x4;
	int y4;
	
	public Quadrilateral(MyDrawing drawing,Point p1, Point p2, Point p3, Point p4)
	{
		this.x1 = x1;
		this.y1=y1;
		this.x2 = x2;
		this.y2=y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.drawing= drawing;
	}
	
	public Quadrilateral(MyDrawing drawing,int x1, int y1, int x2, int y2, int x3, int y3,int x4,int y4)
	{
		this.x1 = x1;
		this.y1=y1;
		this.x2 = x2;
		this.y2=y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		this.drawing= drawing;
	}
	public void draw()
	{
		Line.draw(drawing, this,x1, x2, y1, y2);
		Line.draw(drawing, this, x2, x3, y2, y3);
		Line.draw(drawing,  this,x3, x4, y3, y4);
		Line.draw(drawing,  this,x4, x1, y4, y1);
	}
}
