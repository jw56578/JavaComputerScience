package Shapes;

public class Triangle  {
	MyDrawing drawing;
	public Triangle(MyDrawing drawing)
	{
		this.drawing= drawing;
	}
	public void draw(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		Line.draw(drawing, x1, x2, y1, y2);
		Line.draw(drawing, x2, x3, y2, y3);
		Line.draw(drawing, x3, x1, y3, y1);
	}
}
