package Shapes;

public class Arrow extends Shape{

	Rectangle rect;
	Triangle t;
	public Arrow(MyDrawing drawing, Point p, String direction, int width, int height)
	{
		this.rect = new Rectangle(drawing, p, width, height);
		if(direction == "up")
		{
			//start = px - width/2
			int x1 = p.x - width/2;
			int x2 = p.x + width/2;
			int x3 = p.x + width/2 + width;
			
			int y1 = p.y;
			int y2 = p.y -width;
			int y3 = p.y;
			this.t = new Triangle(drawing, x1, y1, x2, y2, x3, y3);
			
		}
		if(direction == "down")
		{
			//start = px - width/2
			int x1 =  p.x - width/2;
			int x2 = p.x + width/2;
			int x3 = p.x + width/2 + width;
			
			int y1 = p.y + height;
			int y2 = p.y + width + height;
			int y3 = p.y + height;
			this.t = new Triangle(drawing, x1, y1, x2, y2, x3, y3);
			
		}
		if(direction == "left")
		{
			//start = px - width/2
			int x1 =  p.x;
			int x2 = p.x - height;
			int x3 = p.x ;
			
			int y1 = p.y - height/2;
			int y2 = p.y + height/2;
			int y3 = p.y + height/2 + height;
			this.t = new Triangle(drawing, x1, y1, x2, y2, x3, y3);
			
		}
		if(direction == "right")
		{
			//start = px - width/2
			int x1 =  p.x + width;
			int x2 = p.x + width + width/2;
			int x3 = p.x + width;
			
			int y1 = p.y - height/2;
			int y2 = p.y + height/2;
			int y3 = p.y + height/2 + height;
			this.t = new Triangle(drawing, x1, y1, x2, y2, x3, y3);
			
		}
	}
	public void draw()
	{
		this.rect.draw();
		this.t.draw();
	}
	public boolean containsPoint(Point p)
	{
		return rect.containsPoint(p) || t.containsPoint(p);
	}
}
