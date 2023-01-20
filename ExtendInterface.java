
interface NewShape 
{
	void draw();
}
interface Circle extends NewShape
{
	void getRadius();
	int radius = 10;
	
}

class NewCircle implements Circle
{
	public void getRadius()
	{
		System.out.println(radius);
	}
	 public void draw()
	{
		System.out.println("new circle is drawn");
	}
}
class ExtendInterface 
{
	public static void main (String [] args)
	{
		Circle nc = new NewCircle();
		nc.getRadius();
	}
}
