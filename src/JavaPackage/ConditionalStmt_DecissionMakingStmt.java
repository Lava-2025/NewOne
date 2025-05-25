package JavaPackage;

public class ConditionalStmt_DecissionMakingStmt {
	static int l=11;
	//----public static void Calling(int a, double z, double x)
	//---{

	//*	if(z > a)
		//{
	//--	  	System.out.println(z);
	//--	}
	//	else if(z<x)
		//{
			//System.out.println(z);
		//}
		//else {
		//	System.out.println(x);
		//	System.out.println(a);
		//}
		
	//----}
	public static void New() {
		System.out.println("-------");
	}
	public static void main(String[] args) {
	    int a=20,b=1,c=2,d=6;
		double z=5.5,x=3.3;
		int choice;
		
	    JavaMethod JM=new JavaMethod();
		JM.test();

/*
		if(z > a)
		{
		  	System.out.println(z);
		}
		else if(z<x)
		{
			System.out.println(z);
		}
		else {
			System.out.println(x);
			System.out.println(a);
		}
	  // Calling(10,5.5,3.3);
		
		switch(5){
			case 1: 
				System.out.println("case one executed ");
				break;
			case 2:
				System.out.println("case2 cxecuted");
			case 3:
				System.out.println("case three executed");
				break;
				default:
					System.out.println("end");//*
					
			*/	
		
	/*	for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
		} */
		
		/*for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
				if(i==j)
				{
				System.out.println(i*j);
				}
			}
		}
		*/
	/*	for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*while(c<=5)
		{
			System.out.print("*");
			c++;
		}*/
		
		do
		{
			System.out.println("*");
			c++;
		}while(c<=5);
	}

}
