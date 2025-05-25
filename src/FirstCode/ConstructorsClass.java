package FirstCode;

public class ConstructorsClass {
	
ConstructorsClass()
{
	
}
int rollnum;
float Marks;

ConstructorsClass(int A,float m)
{
	rollnum=A;
	Marks=m;
	
}

public void display()
{
	System.out.println(rollnum);
	System.out.println(Marks);
}

	public static void main(String[] args) {
		
		ConstructorsClass ref=new ConstructorsClass(10,400);
		ref.display();
		ConstructorsClass ref2=new ConstructorsClass(20,300);
		ref2.display();
		ConstructorsClass ref3=new ConstructorsClass(30,310);
		ref3.display();
		
	}

}
