package Shapes;
//http://stackoverflow.com/questions/20949650/what-algorithm-is-used-for-computing-a-circle-with-floating-point-radius
public class Circle {

	MyDrawing drawing;
	public Circle(MyDrawing drawing)
	{
		this.drawing= drawing;
	}
	void drawpixel(int x, int y)
	{
		this.drawing.showPoint(x, y);
	}
	void draw(int xc, int yc, int r) {
	    int x= r, y= 0;//local coords     
	    int cd2= 0;    //current distance squared - radius squared
	    if (r==0) return; 
	    drawpixel(xc-r, yc);
	    drawpixel(xc+r, yc);
	    drawpixel(xc, yc-r);
	    drawpixel(xc, yc+r);
	    while (x > y) {    //only formulate 1/8 of circle
	        cd2-= (--x) - (++y);
	        if (cd2 < 0) cd2+=x++;
	        drawpixel(xc-x, yc-y);//upper left left
	        drawpixel(xc-y, yc-x);//upper upper left
	        drawpixel(xc+y, yc-x);//upper upper right
	        drawpixel(xc+x, yc-y);//upper right right
	        drawpixel(xc-x, yc+y);//lower left left
	        drawpixel(xc-y, yc+x);//lower lower left
	        drawpixel(xc+y, yc+x);//lower lower right
	        drawpixel(xc+x, yc+y);//lower right right
	     } 
	}
}
