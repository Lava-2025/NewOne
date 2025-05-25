package FirstCode;

public class GlobalVariables {
	//static String a="Edureka";// outside any method but inside same class 

	//global declaration
	static byte x;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static boolean status;
	static char ch;
	
	public static void main(String[] args) {
	
		//System.out.println(a);// can use just by the name 
        //---DiifMethod();
        
        //GlobalVariables.DiifMethod();
       
	}

	/* public static void DiifMethod()
	 {
		 System.out.println(a);// can use inside class with just using name 
	 }
	 */
	 public static void globalNonStaticMethod()
	 {
		 /*	 GlobalVariables ref= new GlobalVariables();
		 System.out.println(ref.x);
		 System.out.println(ref.b);
		 System.out.println(ref.c);
		 System.out.println(ref.d);
		 System.out.println(ref.e);
		 System.out.println(ref.f);
		 System.out.println(ref.status);
		 System.out.println(ref.ch); */
		 
		 System.out.println(x);
		 System.out.println(b);
		 System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(status);
		System.out.println(ch);
		 
		 
	 }
	 
}
