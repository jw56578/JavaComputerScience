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
		
		//Rectangle quad = new Rectangle(this,new Point(55,55), 333,55);
		//Triangle tri = new Triangle(this,10, 10, 200, 100, 15, 400);
		
		Arrow a = new Arrow(this,new Point(55,55),"down",100,300);
		shapes.add(a);
		
		 a = new Arrow(this,new Point(222,222),"right",300,100);
		 shapes.add(a);
		/*
		//csci348.drawings.DrawingFrame	df = new csci348.drawings.DrawingFrame();
		Circle c = new Circle(this,100, 100, 60);
		shapes.add(c);
		c = new Circle(this,555, 555, 60);
		shapes.add(c);
		
		
		//arrow
		
		
		
		
		Triangle t = new Triangle(this,10, 10, 200, 100, 15, 400);
		shapes.add(t);
		t = new Triangle(this,33, 33, 66, 66, 33, 444);
		shapes.add(t);

		
		Quadrilateral di = new Quadrilateral(this,100, 100, 200, 300, 100, 500,0,300);
		shapes.add(di);
		
		*/
		
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
	void remove(Point p)
	{
		if(this.shapes == null)
			return;
		for(int i = shapes.size()-1; i >=0; i++)
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
