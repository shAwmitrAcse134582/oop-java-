interface NewShape 
{
	void draw();
}

class NewCircle1 implements NewShape
{
	public void draw()
	{
		System.out.println("New circle 1 drawn ");
	}
}

class NewCircle2 implements NewShape
{
	@Override
	public void draw()
	{
		System.out.println("New circle 2 drawn ");
	}
}

class CastInterface
{
	public static void main (String [] args)
	{
		NewShape nc1 = new NewCircle1();
		NewShape nc2 = new NewCircle2();
		nc1.draw();
		nc2.draw();
	}
}