interface FamousLine 
{
	void ShowLine();
}
class Novel1 implements FamousLine
{
	public void ShowLine()
	{
		System.out.println("To be , or not to be Novel1 ");
	}
}
class Novel2 implements FamousLine
{
	@Override
	public void ShowLine()
    {
	System.out.println("To be , or not to be Novel2 ");
	}
	public void AuthorName()
	{
		System.out.println("Shakespeare");
	}
}

public class Interface 
{
	public static void main(String args [])
	{
		Novel1 hamlet = new Novel1();
		Novel2 juliet = new Novel2();
		hamlet.ShowLine();
		juliet.AuthorName();
	}
}