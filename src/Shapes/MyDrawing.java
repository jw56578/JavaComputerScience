package Shapes;


import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class MyDrawing extends csci348.drawings.SimpleDrawing
{
	int resize = 0;
	List<Shape> shapes = new ArrayList<Shape>();
	public MyDrawing(int width, int height)
	{
		super(width,height);
		draw();
	}
	public void draw()
	{
		this.hideAllPoints();
		if(this.shapes == null)
			return;
		for (Shape shape : shapes) {
			if(shape != null)
				shape.draw();
		}
	}
	public void addShape(Shape s)
	{
		shapes.add(s);
		draw();
	}
	void remove(Point p)
	{
		if(this.shapes == null)
			return;
		for(int i = shapes.size()-1; i >=0; i--)
		{
			Shape shape = shapes.get(i);
			if(shape != null && shape.containsPoint(p))
			{
				int index = shapes.indexOf(shape);
				shapes.remove(index);
				return;
			}
		}
		/*
		for (Shape shape : shapes) {
			if(shape != null && shape.containsPoint(p))
			{
				int index = shapes.indexOf(shape);
				shapes.remove(index);
				return;
			}
		}
		*/
	}
	public void mouseClicked(java.awt.event.MouseEvent e)
	{
		//JOptionPane.showMessageDialog(null,"clicked");
		
		int x = e.getX();
		int y = e.getY();
		remove(new Point(x,y));
		//super.mouseClicked(e);
		draw();
	}
	public void componentResized(ComponentEvent e)
	{
		resize++;
		if(resize > 500)
		{
			Circle c = new Circle(this,666, 666, 60);
			c.draw();
			
		}
		draw();
		
		super.componentResized(e);

	}
	
}
