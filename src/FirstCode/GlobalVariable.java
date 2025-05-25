package FirstCode;

public class GlobalVariable {
	static String school="Jain International School";
	int rollnum;
	String name;
	

	public static void main(String[] args) {
		GlobalVariable ref1=new GlobalVariable();
		
		ref1.name="pallavi";
		ref1.rollnum=100;
		
		ref1.display();
		
		System.out.println("----------------");

    GlobalVariable ref2=new GlobalVariable();
		
		ref2.name="manju";
		ref2.rollnum=101;
		GlobalVariable.school="DAV public school"; // now school data is changed from jain international school to DAV public school
		
		ref2.display();
		
		System.out.println("----------------");
		
		GlobalVariable ref3=new GlobalVariable();
		ref3.name="Pooja";
		ref3.rollnum=102;
		
		ref3.display(); // school name will be DAV public school by default as its changed in previous declaration

	}


	public void display() 
	{
		System.out.println("Name"+name);
		System.out.println("roll Num"+rollnum);
		System.out.println("School Name"+school);
	}

}
