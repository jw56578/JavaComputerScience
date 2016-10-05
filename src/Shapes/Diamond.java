package Shapes;

public class Diamond  {
	MyDrawing drawing;
	public Diamond(MyDrawing drawing)
	{
		this.drawing= drawing;
	}
	public void draw(int x1, int y1, int x2, int y2, int x3, int y3,int x4,int y4)
	{
		Line.draw(drawing, x1, x2, y1, y2);
		Line.draw(drawing, x2, x3, y2, y3);
		Line.draw(drawing, x3, x4, y3, y4);
		Line.draw(drawing, x4, x1, y4, y1);
	}
}
