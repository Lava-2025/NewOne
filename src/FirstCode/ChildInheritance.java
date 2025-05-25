package FirstCode;

public class ChildInheritance extends Inheritance
{

	String bankMoney="1000dollers";
	public void Job()
	{
		System.out.println("This is son"+bankMoney);
	}

	public static void main(String[] args) {
		ChildInheritance i=new ChildInheritance();
		System.out.println("Father");
		i.Plot_100_Ecres();
		System.out.println(i.name);
		System.out.println("---------------");
		System.out.println("son");
		System.out.println(i.bankMoney);
		i.Job();
		
		
	}

}
