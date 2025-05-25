package FirstCode;

public class MethodOverloading {
	static MethodOverloading MO=new MethodOverloading();
	
	public void Click(int n)
	{
		System.out.println("Non static Number type"+n);
	}
	
	public void Click()
	{
	
		Click(7);
		System.out.println("No arguments");
	}
	
	public static void Move()
	{
		MO.Click();
		Move("Mouse Moving");
	}
	
	public static void Move(String a)
	{
		System.out.println("String method static" +a);
	}

	public static void main(String[] args) {
		Move();
		Move("Moving Mouse");
		MethodOverloading MO=new MethodOverloading();
		MO.Click();

	}

}
