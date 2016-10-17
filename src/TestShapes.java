import java.util.ArrayList;
import java.util.List;

import Shapes.Arrow;
import Shapes.MyDrawing;
import Shapes.Parallelogram;
import Shapes.Point;
import Shapes.Shape;
import Shapes.Circle;
import Shapes.Triangle;

public class TestShapes {

	public TestShapes()
	{
		//Rectangle quad = new Rectangle(this,new Point(55,55), 333,55);
		//Triangle tri = new Triangle(this,10, 10, 200, 100, 15, 400);
		MyDrawing  d = new MyDrawing(600,600);
		List<Shape> shapes = new ArrayList<Shape>();
		Shapes.Arrow a = new Shapes.Arrow(d,new Point(55,55),"down",100,300);
		d.addShape(a);
		
		 a = new Arrow(d,new Point(222,222),"right",300,100);
		 d.addShape(a);
		
		//csci348.drawings.DrawingFrame	df = new csci348.drawings.DrawingFrame();
		Circle c = new Circle(d,100, 100, 60);
		//d.addShape(c);
		c = new Circle(d,555, 555, 60);
		//d.addShape(c);
		
		
		//arrow
		
		
		
		
		Triangle t = new Triangle(d,10, 10, 200, 100, 15, 400);
		//d.addShape(t);
		t = new Triangle(d,33, 33, 66, 66, 33, 444);
		//d.addShape(t);

		/*
		Quadrilateral di = new Quadrilateral(this,100, 100, 200, 300, 100, 500,0,300);
		shapes.add(di);
		
		*/
		Parallelogram pl = new Parallelogram(d, new Point(100,100), new Point(200,140),new Point(200,200));
		//d.addShape(pl);
		
		pl = new Parallelogram(d, new Point(100,100), new Point(200,50),new Point(200,200));
		d.addShape(pl);
		
	}
}
