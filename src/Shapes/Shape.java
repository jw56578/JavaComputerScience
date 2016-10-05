package Shapes;

import java.awt.Color;

import csci348.drawings.Drawing;
import csci348.drawings.SimpleDrawing;

/*
 * Introduction
 He also wants to be able to remove elements from his

drawing by clicking on them. See full details in the Tasks section below.

The third-party vendor whose software you are using in your application has released a new version

that you are to use for your enhancements. The new version allows you to do the following things:

1. set an initial size for the drawing window

2. resize the drawing window

3. set foreground colors

4. set background colors

5. handle mouse events

See the javadoc for details. To use many of these new features, you must extend the DrawingFrame

class from your third-party vendor and override the relevant methods. The new event handling

methods are piggy-backed onto (wrap) the corresponding methods in the javax.swing package. You

can get further information on how to use them there.

Tasks

1. Draw upward and downward pointing triangles. Triangles may have any shape you like.

2. Draw circles.

3. Draw parallelograms. Parallelograms may have any shape you like.

4. Draw diamonds. Diamonds may have any shape you like.

5. Draw arrows.

6. Remove elements that are clicked on from the drawing.

7. The user should be able to specify elements outside of the current dimensions of the drawing

window. Your application should make these visible when the window is resized to include

any elements whose coordinates are inside the resized window. This includes showing partial

elements that overlap the edges of the window.

1

CSCI 373 Fall 2016

8. Keep a log of what changes you needed to make to each component of your application as

you develop your enhancements.

Submission

The assignment is due Thursday, October 6, at midnight. Place all your source files, a pdf of your

change log, and any other documentation in a folder, zip it, and submit via Moodle.
 */
public class Shape {
	public Shape()
	{
		//csci348.drawings.DrawingFrame	df = new csci348.drawings.DrawingFrame();
		
		MyDrawing d = new MyDrawing(600,600);

		Circle c = new Circle(d);
		c.draw(100, 100, 60);
		
		Triangle t = new Triangle(d);
		t.draw(10, 10, 20, 10, 15, 40);
		
		
		Diamond di = new Diamond(d);
		di.draw(100, 100, 200, 300, 100, 500,0,300);
		//for(int i = 0; i < 100; i ++){
		//	for(int a = 0; a < 100;a ++){
		//		d.showPoint(i, a);
		//	}
		//
	}
}
