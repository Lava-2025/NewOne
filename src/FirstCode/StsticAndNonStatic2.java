package FirstCode;

public class StsticAndNonStatic2 {
	
	static int a=10;
	public static void Look()
	{
	System.out.println("Look Method");//statis method can called inside other static method
	}
	
	int l=1;
	public void back()
	{
		int h=20;
		System.out.println("back method"+h);
	}

	public static void main(String[] args) {
		System.out.println(a);
		Look();
		StsticAndNonStatic2 ref=new StsticAndNonStatic2();
		System.out.println(ref.l);
		ref.back();
	}

}
