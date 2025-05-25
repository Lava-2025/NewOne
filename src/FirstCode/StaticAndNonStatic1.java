package FirstCode;

public class StaticAndNonStatic1 {

	public static void main(String[] args) {
		
		StsticAndNonStatic2 ref1= new StsticAndNonStatic2();
		System.out.println(StsticAndNonStatic2.a);
		StsticAndNonStatic2.Look();
		
		System.out.println(ref1.l);
		ref1.back();
	

	}

}
